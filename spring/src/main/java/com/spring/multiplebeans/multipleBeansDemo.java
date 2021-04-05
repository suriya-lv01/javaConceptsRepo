package com.spring.multiplebeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class multipleBeansDemo {
	
	public static void main(String args[])
	{
		//Define bean list
		//ApplicationContext context	=	new ClassPathXmlApplicationContext(new String[] {"beans_multiple_employee.xml","beans_multiple_salary.xml"});
		
		//Using bean import 
		//ApplicationContext context	=	new ClassPathXmlApplicationContext("beans_multiple_employee.xml");
		
		//using depends on
		ApplicationContext context	=	new ClassPathXmlApplicationContext("beans_employee_dependson.xml");
		
		
		Employee employee			=	(Employee) context.getBean("employee");
		System.out.println(employee);
	}
	

}
