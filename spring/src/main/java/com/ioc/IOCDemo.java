package com.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCDemo {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_ioc.xml");
		AccessRecord accessRecord = (AccessRecord) context.getBean("accessRecord");
		accessRecord.displayRecord();
	}
}
