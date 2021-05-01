package java8;

public class samplePrograms {

	int test_a, test_b;

	samplePrograms(int a, int b) {
		test_a = a;
		test_b = b;
	}

	public static void main(String args[]) {

		samplePrograms test = new samplePrograms(3, 4);
		System.out.println(test.test_a + test.test_b);

	}
}
