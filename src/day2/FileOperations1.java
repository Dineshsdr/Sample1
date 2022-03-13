package day2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperations1 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Test Folder\\Dinesh Credentials\\text.xls");
		
		// This is to create only one folder
//		boolean mkdir = f.mkdir();
//		System.out.println(mkdir);
		
		// To Create multiple folders
//		boolean mkdirs = f.mkdirs();
//		System.out.println(mkdirs);
		
		//Create a New File
//		boolean createNewFile = f.createNewFile();		
//		System.out.println(createNewFile);
//		
//		//File is readable or Not
//		boolean canRead = f.canRead();
//		System.out.println(canRead);
//		
//		//File is Writable or Not
//		boolean canWrite = f.canWrite();
//		System.out.println(canWrite);
//		
//		//File is Executable or Not
//		boolean canExecute = f.canExecute();
//		System.out.println(canExecute);
//		
//		//Check it is File or Not
//		boolean file = f.isFile();
//		System.out.println(file);
//		
//		//Check its directory or Not
//		boolean directory = f.isDirectory();
//		System.out.println(directory);
		
		FileUtils.write(f, "Credentials");
		
		//Overwrite
		FileUtils.write(f, "FB Credentials:",false);
		
		FileUtils.write(f, "\nUserName: Dineshdr\nPassword:123",true);
		
		List<String> f1 = FileUtils.readLines(f);
		for (String st: f1) {
			System.out.println(st);
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
