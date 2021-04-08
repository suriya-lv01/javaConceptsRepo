package di_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiDemo {
	
	public static void main(String args[])
	{
		ApplicationContext context	=	new ClassPathXmlApplicationContext("di_collections/bean_di_collections.xml");
		Employee employee	=	(Employee) context.getBean("employee");
		System.out.println(employee);		
	}

}
