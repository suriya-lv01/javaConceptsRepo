package scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class scopesDemo {

	public static void main(String args[]) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/scopes/bean_scopes.xml");
		Employee employee1 = (Employee) context.getBean("employee");
		Employee employee2 = (Employee) context.getBean("employee");
		System.out.println(employee1);
		employee1.getSalary().setAllowance(200);
		System.out.println(employee2);

	}

}
