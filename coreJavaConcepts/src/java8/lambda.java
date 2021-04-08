package java8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lambda {

	interface StringFunction {
		String run(String r);
	}

	public static void printFormatted(String input, StringFunction lambdaFunction) {
		System.out.println(lambdaFunction.run(input));
	}

	public static void main(String args[]) {

		// Declare arraylist and add some items to it
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		numArray.add(1);
		numArray.add(3);
		numArray.add(5);

		// Simple Lambda expression at work
		numArray.forEach((a) -> System.out.println(a));

		// Saving Lambda expression to a variable
		// variable's type needs to be an interface with only one method. Example :
		// java.util.functions.Consumer
		Consumer<Integer> lambdaVariable = (b) -> System.out.println(b);
		numArray.forEach(lambdaVariable);

		// Using lambda function in a method
		// Method needs to have a parameter , with a single method Interface as its type
		StringFunction addquestion = (s) -> s + "?";
		printFormatted("Hello", addquestion);

	}

}
