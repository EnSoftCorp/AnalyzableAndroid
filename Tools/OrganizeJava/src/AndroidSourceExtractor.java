import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.LinkedList;
import java.util.List;

/**
 * A class to crawl over a directory containing disorganized Java source code and organize it correctly
 * into nested folders according to the package. In other words, this organizes source code in a manner
 * which would be usable by, say, Eclipse.
 * 
 * @author Tom Deering
 *
 */
public class AndroidSourceExtractor {
	public static final String ORGANIZE="-O";
	public static final String LIST="-L";
	public static final int ERROR_BAD_ARGS=-1;

	/**
	 * Arg 1: Directory containing disorganized source.
	 * Arg 2: Destination directory for organized source.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{
		if(ORGANIZE.equalsIgnoreCase(args[0]) && args.length == 3){
			organizeSource(args);
		}else if(LIST.equalsIgnoreCase(args[0]) && args.length == 2){
			sourceList(args);
		}else{
			printUsage(args);
			System.exit(ERROR_BAD_ARGS);
		}
	}
	
	private static void printUsage(String[] args){
		// TODO
	}
	private static void sourceList(String[] args){
		// TODO
	}
	
	private static void organizeSource(String[] args){
		String srcDir = new File(args[1]).getAbsolutePath();
		String destDir = new File(args[2]).getAbsolutePath();
		
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
				copyFile(f, new File(newDir + File.separator + fileName));
			} catch(Exception e){
				System.err.println("Failed to organize file: " + f.getAbsolutePath());
			}
		}
	}
	
	private static boolean shouldIgnore(String pkg, String fileName){
/*		// Package prefixes to ignore
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
*/
		return false;
	}
	
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
	
	private static List<File> findJavaSource(String curDir){
		List<File> files = new LinkedList<File>();
		recFindJavaSource(null, new File(curDir), files);
		return files;
	}
	
	private static void recFindJavaSource(File lastDir, File curDir, List<File> files){
		for(File f : curDir.listFiles()){
			if(f.isDirectory()) recFindJavaSource(curDir, f, files);

			else if(f.length() > 16){
				String[] nameParts = f.getName().split("\\.");
				if(nameParts.length > 1 && "java".equalsIgnoreCase(nameParts[nameParts.length - 1])){
					files.add(f);
				}
			}
		}
	}
}
