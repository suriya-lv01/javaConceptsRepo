package coreJava;

public class Strings {

	public static void main(String args[]) {
		/*
		 * String - Immutable vs StringBuffer - Mutable
		 */

		String s1 = new String("simple ");
		// This creates a new object with no reference, hence goes for GC
		s1.concat("string");
		System.out.println("Immutable String : " + s1);

		StringBuffer s2 = new StringBuffer("simple ");
		// This appends on top of s2 , so changes are saved
		s2.append("string buffer");
		System.out.println("Mutable StringBuffer : " + s2);

	}

}
