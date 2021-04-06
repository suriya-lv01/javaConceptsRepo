package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lifecycleDemo {

	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle/bean_lifecycle.xml");
		context.registerShutdownHook();
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);

	}

}
