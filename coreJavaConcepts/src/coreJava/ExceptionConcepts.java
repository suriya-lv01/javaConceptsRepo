package coreJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class ExceptionConcepts {
	
	public static void main(String args[]) {
		
		//Checked Exception 
		//Checked by Compiler and needs to be handled or declared to the thrown
		try {
			String curDir	=	System.getProperty("user.dir");
			PrintWriter pw	=	new PrintWriter(new File(curDir+"\\src\\coreJava\\resources\\printfile.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Unchecked Exception
		//Not checked by compiler and will create problems at runtime
		System.out.println(10/0);
		
				
	}

}
