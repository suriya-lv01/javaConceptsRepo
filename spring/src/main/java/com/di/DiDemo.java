package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiDemo {
	
	public static void main(String args[])
	{
		ApplicationContext context	=	new ClassPathXmlApplicationContext("beans_di.xml");
		Employee employee	=	(Employee) context.getBean("employee");
		employee.setNetpay(employee.getBasicpay()+employee.getAllowances());
		System.out.println(employee);
		
	}

}
