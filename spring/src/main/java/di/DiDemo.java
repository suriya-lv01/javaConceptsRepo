package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.Employee;

public class DiDemo {
	
	public static void main(String args[])
	{
		ApplicationContext context	=	new ClassPathXmlApplicationContext("di/bean_di.xml");
		Employee employee	=	(Employee) context.getBean("employee");
		employee.setNetpay(employee.getBasicpay()+employee.getAllowances());
		System.out.println(employee);
		
	}

}
