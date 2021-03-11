package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class calculatorTest {

	private Calculator calculator;
	
	@Before
	public void setup() throws Exception{
		calculator=new Calculator();
	}
	
	@Test
	public void multipleTest() {
		assertEquals("Multiple should return correct value 20",20, calculator.multiply(5, 4));
	}
	
}
