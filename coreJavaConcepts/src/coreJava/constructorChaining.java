package coreJava;

public class constructorChaining {
	/*
	 * Constructor chaining enables us to call one constructor from another
	 * constructor of the class with respect to the current class object. 
	 * We can use this keyword to perform constructor chaining within the same class.
	 */
	String name;
	int age;
	
	public constructorChaining(String name) {
		this.name	=	name;
	}

	public constructorChaining(String name,int age) {
		this(name);
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "constructorChaining [name=" + name + ", age=" + age + "]";
	}

	public static void main(String args[]) {
		constructorChaining cc	=	new constructorChaining("Sara",30);
		System.out.println(cc);
		
	}
}
