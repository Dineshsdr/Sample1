package day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileOperations2 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Test Folder\\Dinesh Credentials\\text.txt");
		

		FileUtils.write(f, "\nWelcome to Jave Class");
		
		//Overwrite
		FileUtils.write(f, "Welcome to Python Class",false);
		
		FileUtils.write(f, "\nWelcome to Selenium Class",true);
		
		//FileUtils.
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
