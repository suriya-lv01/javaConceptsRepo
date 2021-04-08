package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo 
{
	 public static void main(String args[]) {
		 ApplicationContext context =
		            new ClassPathXmlApplicationContext("spring/bean.xml");
		 Employee employee = (Employee) context.getBean("employee");
		 System.out.println("My name is " + employee.getName());
		   }
}
