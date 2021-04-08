package multiplebeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class multipleBeansDemo {
	
	public static void main(String args[])
	{
		//Define bean list
		ApplicationContext context	=	new ClassPathXmlApplicationContext(new String[] {"/multiplebeans/bean_employee.xml","/multiplebeans/bean_salary.xml"});
		
		//Using bean import 
		//ApplicationContext context	=	new ClassPathXmlApplicationContext("/multiplebeans/bean_employee_imports.xml");
		
		//using depends on
		//ApplicationContext context	=	new ClassPathXmlApplicationContext("multiplebeans/bean_employee_dependson.xml");
		
		
		Employee employee			=	(Employee) context.getBean("employee");
		System.out.println(employee);
	}
	

}
