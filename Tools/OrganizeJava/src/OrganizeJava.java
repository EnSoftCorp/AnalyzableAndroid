import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

/**
 * A class to crawl over a directory containing disorganized Java source code and organize it correctly
 * into nested folders according to the package. In other words, this organizes source code in a manner
 * which would be usable by, say, Eclipse.
 * 
 * @author Tom Deering, Ben Holland
 */
public class OrganizeJava {
	/**
	 * Run with no arguments to prompt for input/output directories
	 * 
	 * Arg 0: Directory containing disorganized source.
	 * Arg 1: Destination directory for organized source.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{
		
		// warning for users running this util on Windows
		if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0){
			System.err.println("The Windows filesystem may have issues when dealing "
					+ "with file paths of source built on non-Windows systems. "
					+ "Proceed at your own risk by editing this program...");
			System.exit(-1);
		}
		
		// if args were not provided prompt user for them
		if(args.length == 0){
			args = new String[2];
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter input directory: ");
			args[0] = scanner.nextLine();
			while(!isValidInputDirectory(args[0])){
				System.err.println("Invalid input directory, please enter input directory: ");
				args[0] = scanner.nextLine();
			}
			System.out.println("Please enter output directory: ");
			args[1] = scanner.nextLine();
			while(!isValidOutputDirectory(args[1])){
				System.err.println("Invalid output directory, please enter output directory: ");
				args[1] = scanner.nextLine();
			}
			scanner.close();
		}
		
		organizeSource(args);
		
		System.out.println("Finished.");
	}
	
	/**
	 * Returns true if the directory exists
	 * @param input
	 * @return
	 */
	private static boolean isValidInputDirectory(String input){
		if(input == null){
			return false;
		} else {
			File file = new File(input);
			if(!file.exists()){
				System.err.println("Input directory does not exist.");
				return false;
			}
			if(!file.isDirectory()){
				System.err.println("Input directory is not a directory.");
				return false;
			}
			return true;
		}
	}
	
	/**
	 * Returns true if the directory exists and is empty
	 * Creates the directory if it does not exist
	 * @param input
	 * @return
	 */
	private static boolean isValidOutputDirectory(String input){
		if(input == null){
			return false;
		} else {
			File file = new File(input);
			file.mkdirs();
			if(!file.exists()){
				System.err.println("Output directory does not exist or could not be made.");
				return false;
			}
			if(!file.isDirectory()){
				System.err.println("Output directory is not a directory.");
				return false;
			}
			if(file.listFiles().length != 0){
				System.err.println("Output directory is not empty. Contains " + file.listFiles().length + " files.");
				return false;
			}
			return true;
		}
	}
	
	/**
	 * Organizes the given source directory
	 * Ignores the source files and package folders defined in the shouldIgnore method
	 * @param args
	 */
	private static void organizeSource(String[] args){
		
		// sanity checks
		if(!isValidInputDirectory(args[0])){
			throw new IllegalArgumentException("Invalid input directory.");
		}
		if(!isValidOutputDirectory(args[1])){
			throw new IllegalArgumentException("Invalid output directory.");
		}
		
		String srcDir = new File(args[0]).getAbsolutePath();
		String destDir = new File(args[1]).getAbsolutePath();
		
		// Go through all .java files in the given directory
		for(File f : findJavaSource(srcDir)){
			try{
				// Find the new path based on the package
				String pkg = getPackage(f);
				String fileName = f.getName();
				if(shouldIgnore(pkg, fileName)) continue;
				
				pkg = pkg.replaceAll("\\.", File.separator);
				File newDir = new File(destDir + File.separator + (pkg.isEmpty() ? "":(pkg + File.separator)));
				
				// Build the directories if they don't already exist
				newDir.mkdirs();
				
				// Copy the file to its new location
				if (f.getAbsolutePath().contains("libart")){
					continue;
				}
				for (String filePath : newDir.list()){
					if (f.getAbsolutePath().equals(filePath)){
							continue;
					}
				}
				
				String newLocation = getNewPath(f, newDir + File.separator + fileName );
				if(newLocation != null) copyFile(f, new File(newLocation));
			} catch(Exception e){
				System.err.println("Failed to organize file: " + f.getAbsolutePath());
			}
		}
	}
	
	/**
	 * Returns the file path
	 * Returns null if the source file is known to be a stub file
	 * Some general logic to overwrite a source file if its much much larger the current version
	 * @param toCopy
	 * @param newFile
	 * @return
	 * @throws IOException
	 */
	private static String getNewPath(File toCopy, String newFile) throws IOException{
		File existing = new File(newFile);
		
		// Don't copy over a stubbed file!
		if(toCopy.getAbsolutePath().contains("_stub_")) return null;
		if(toCopy.getAbsolutePath().contains("_stubs_")) return null;
		if(FileUtils.readFileToString(toCopy).contains("RuntimeException(\"Stub!\")")) return null;
		
		// If no file is already present, there is nothing to resolve
		if(!existing.exists()) return newFile;
		
		// If the two files are identical, we don't need to overwrite the existing one.
		if(FileUtils.contentEquals(toCopy, existing)) return null;
		
		// If one file is much larger than the other (this usually indicates that the other is a stubbed
		// file or is lacking JavaDocs), keep the larger one
		long s1 = toCopy.length();
		long s2 = existing.length();
		
		// New file is much bigger. Overwrite.
		if(s1 * 1.0 / s2 > 3.0){
			return newFile;
		}
		// Old file is much bigger. Keep.
		else if(s2 * 1.0 / s1 > 3.0){
			return null;
		}
		
		// The two files are not identical. We need to compute a new name for the new file.
		String name = existing.getName();
		String path = newFile.substring(0, newFile.lastIndexOf(name));
		String[] nameParts = name.split("\\.");
		String extension = nameParts[nameParts.length - 1];
		String baseName = name.substring(0, name.lastIndexOf("." + extension));
		
		for(int i=1; i<Integer.MAX_VALUE; i++){
			String proposed = path + baseName + "_" + i + "." + extension;
			if(!new File(proposed).exists()) return proposed;
		}
		
		return null;
	}
	
	/**
	 * Defines file and package names to ignore
	 * @param pkg
	 * @param fileName
	 * @return
	 */
	private static boolean shouldIgnore(String pkg, String fileName){
		// Package prefixes to ignore
		if(pkg.isEmpty()) return true;
		if(pkg.startsWith("test")) return true;
		if(pkg.startsWith("proguard")) return true;
		if(pkg.startsWith("sample")) return true;
		if(pkg.startsWith("benchmarks")) return true;
		if(pkg.startsWith("${package}")) return true;
		if(pkg.startsWith("util.build")) return true;
		if(pkg.startsWith("signature")) return true;
		if(pkg.startsWith("dummy")) return true;
		if(pkg.startsWith("foo.bar")) return true;
		if(pkg.startsWith("name.fraser.neil.plaintext")) return true;
		if(pkg.startsWith("junit")) return true;
		if(pkg.startsWith("jdiff")) return true;
		if(pkg.startsWith("dot")) return true;
		if(pkg.startsWith("org.java")) return true;
		if(pkg.startsWith("org.mockito")) return true;
		if(pkg.startsWith("com.xtremelabs.robolectric")) return true;
		if(pkg.startsWith("javassist")) return true;
		if(pkg.startsWith("org.w3c")) return true;
		if(pkg.startsWith("org.eclipse")) return true;
		if(pkg.startsWith("org.jivesoftware")) return true;
		if(pkg.startsWith("org.jf")) return true;
		if(pkg.startsWith("org.chromium")) return true;
		if(pkg.startsWith("org.antlr")) return true;
		
		// Package name contents to ignore
		if(pkg.contains("test")) return true;
		if(pkg.contains("junit")) return true;
		if(pkg.contains("example")) return true;

		// File name contents to ignore
		if(fileName.contains("Test")) return true;
		return false;
	}
	
	/**
	 * Copies a file from a source to a destination file location
	 * @param from
	 * @param to
	 * @throws IOException
	 */
	private static void copyFile(File from, File to) throws IOException{
		FileInputStream fisFrom = new FileInputStream(from);
		FileOutputStream fisTo = new FileOutputStream(to);
		FileChannel inputChannel = fisFrom.getChannel();
		FileChannel outputChannel = fisTo.getChannel();
		outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
		inputChannel.close();
		outputChannel.close();
		fisTo.close();
		fisFrom.close();
	}
	
	/**
	 * Parses the java package from the source file
	 * @param f
	 * @return
	 * @throws IOException
	 */
	private static String getPackage(File f) throws IOException{
		RandomAccessFile raf = new RandomAccessFile(f, "r");
		while(true){
			String line = raf.readLine();
			if(line == null) {
				raf.close();
				return "";
			}
			line = line.trim();
			if(line.startsWith("package ")){
				raf.close();
				return line.replace("package ", "").replace(";", "").trim();
			}
		}
	}
	
	/**
	 * Recursively finds java source files
	 * @param curDir
	 * @return
	 */
	private static List<File> findJavaSource(String curDir){
		List<File> files = new LinkedList<File>();
		recFindJavaSource(null, new File(curDir), files);
		return files;
	}
	
	// private helper method to recursively file java source files
	private static void recFindJavaSource(File lastDir, File curDir, List<File> files){
		for(File f : curDir.listFiles()){
			if(f.isDirectory()) {
				recFindJavaSource(curDir, f, files);
			} else if(f.length() > 16){
				String[] nameParts = f.getName().split("\\.");
				if(nameParts.length > 1 && "java".equalsIgnoreCase(nameParts[nameParts.length - 1])){
					files.add(f);
				}
			}
		}
	}
}
