package week3NCPL;
//Checked Exceptions are always handled by using try and catch blocks. Here we are writing program for IO,FileNotFound - checked Exceptions

//Here my java cannot access my system because my system don't give permission to java to create a new file. 
//it is always a good practice to handle unchecked exceptions and we can also handle them programmatically and also by using try and catch block


import java.io.File;
import java.io.IOException;


public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File f = new File("/Users/moulikaaravalli/Desktop/NewFile.txt");
		File f = new File("/Users/moulikaaravalli/cartoon/NewFile.txt");
		
		
		//f.createNewFile(); ||  "IO Exception" || error - it is forcing us to handle the IO exception, mandatory to handle the IO exception. lets use try block 
		try {
			f.createNewFile();
			System.out.println("New File Created");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		//Here we are trying to create a file in my system folder. system Administrator generally dont give permission to java to create a new file in 3rd party i.e my system
		//we get access denied / no such file or directory found when given path is not matching to the system folder path.
		//above code runs perfectly fine for checked IO Exceptional Handling and Filenotfound.

	}

}
