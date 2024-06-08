package singletonPattern;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class singletonClassImpl {

	static SingletonClass singletonClass1 = null;
	static SingletonClass singletonClass2 = null;

	public static void main(String args[]) throws FileNotFoundException, IOException {
		
		singletonClass1	=	SingletonClass.getSingletonClass();
		singletonClass2	=	SingletonClass.getSingletonClass();
		
		if(singletonClass1==singletonClass2) {
			System.out.println("singleton class test successful");
		}
		
		
		
		ObjectOutputStream oos	=	new ObjectOutputStream(new FileOutputStream("/src/singletonPattern/objectoutfile.txt"));
		
		
		
	}

}
