package coreJava;

public class Strings {

	public static void main(String args[]) {

		// Concept#1
		// String Immutable vs StringBuffer Mutable
		String s1 = new String("simple ");
		s1.concat("string"); // This creates a new object with no reference, hence goes for GC
		System.out.println("String Immutable : " + s1); // Output - simple
		
		StringBuffer sb1 = new StringBuffer("simple ");
		sb1.append("string buffer"); // This appends to sb1 and changes are saved 
		System.out.println("StringBuffer Mutable : " + sb1 + "\n"); // Output - simple string buffer

		// Concept#2
		// String & StringBuffer - == vs equals() method
		// == Reference comparison in both
		// String.equals() Object.equals() overridden for content comparison
		// SringBuffer.equals() Object.equals() not overridden, so Reference comparison only

		String s2 = new String("Hello");
		String s3 = new String("Hello");
		System.out.println("String == :" + (s3 == s2)); // false
		System.out.println("String equals() :" + s3.equals(s2)); // True

		StringBuffer sb2 = new StringBuffer("Hello");
		StringBuffer sb3 = new StringBuffer("Hello");
		System.out.println("StringBuffer == :" + (sb2 == sb3)); // false
		System.out.println("StringBuffer equals() :" + sb2.equals(sb3) + "\n"); // false

	}
}
