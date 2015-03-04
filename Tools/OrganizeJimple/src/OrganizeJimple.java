import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class OrganizeJimple {

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
			args = new String[1];
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter Jimple directory: ");
			args[0] = scanner.nextLine();
			while(!isValidInputDirectory(args[0])){
				System.err.println("Invalid input directory, please enter input directory: ");
				args[0] = scanner.nextLine();
			}
			scanner.close();
		}
		
		List<File> jimpleFiles = findJimpleFiles(args[0]);
		Map<String, List<String>> collisionMap = new HashMap<String, List<String>>(jimpleFiles.size());
		
		// Go through all the Jimple files
		for(File f : jimpleFiles){
			try{
				String name = f.getName();
				
				List<String> existing = collisionMap.get(name);
				if(existing == null){
					existing = new LinkedList<String>();
					collisionMap.put(name, existing);
				}
				existing.add(f.getAbsolutePath());
			} catch(Exception e){
				System.err.println("Failed to examine file: " + f.getAbsolutePath());
			}
		}
		
		for(String fName : collisionMap.keySet()){
			List<String> found = collisionMap.get(fName);
			if(found.size() > 1){
				boolean libart = false;
				for(String s : found){
					if(s.contains("libart")){
						libart = true;
						break;
					}
				}
				if(!libart) System.out.println(found.toString());
			}
		}

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
	 * Recursively finds java source files
	 * @param curDir
	 * @return
	 */
	private static List<File> findJimpleFiles(String curDir){
		List<File> files = new LinkedList<File>();
		recFindJimpleFiles(null, new File(curDir), files);
		return files;
	}
	
	// private helper method to recursively file java source files
	private static void recFindJimpleFiles(File lastDir, File curDir, List<File> files){
		for(File f : curDir.listFiles()){
			if(f.isDirectory()) {
				recFindJimpleFiles(curDir, f, files);
			} else if(f.length() > 16){
				String[] nameParts = f.getName().split("\\.");
				if(nameParts.length > 1 && "jimple".equalsIgnoreCase(nameParts[nameParts.length - 1])){
					files.add(f);
				}
			}
		}
	}
}
