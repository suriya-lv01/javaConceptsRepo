package lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lifecycleDemoAttributes {

	public static void main(String args[]) {
		AbstractApplicationContext context	=	new ClassPathXmlApplicationContext("lifecycle/bean_lifecycle_attributes.xml");
		EmployeeAttributes employee	=	(EmployeeAttributes) context.getBean("employee");
		context.registerShutdownHook();
		System.out.println(employee);
		
	}

}
