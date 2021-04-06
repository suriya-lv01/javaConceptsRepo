package scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class scopesDemo {

	public static void main(String args[]) {

//		Singleton Scope
//		ApplicationContext context = new ClassPathXmlApplicationContext("/scopes/bean_singleton.xml");
		
//		Prototype Scope
		ApplicationContext context = new ClassPathXmlApplicationContext("/scopes/bean_prototype.xml");
		
		Employee employee1 = (Employee) context.getBean("employee1");
		Employee employee2 = (Employee) context.getBean("employee2");
		System.out.println(employee1);
		employee1.getSalary().setAllowance(200);
		System.out.println(employee2);

	}

}
