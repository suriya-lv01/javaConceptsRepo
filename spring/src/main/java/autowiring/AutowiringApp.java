package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringApp {

	public static void main(String args[])
	{
		
		ApplicationContext	context	=	new ClassPathXmlApplicationContext("/autowiring/bean_autowiring_byName.xml");
		//ApplicationContext	context	=	new ClassPathXmlApplicationContext("/autowiring/bean_autowiring_byType.xml");
		//ApplicationContext	context	=	new ClassPathXmlApplicationContext("/autowiring/bean_autowiring_byConstructor.xml");
		Employee employee			=	context.getBean(Employee.class);
		System.out.println(employee);
	}
}
