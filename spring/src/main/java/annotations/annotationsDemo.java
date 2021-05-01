package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context	=	new ClassPathXmlApplicationContext("annotations/bean_annotations.xml");
		Employee employee			=	(Employee) context.getBean("employee");
		System.out.println(employee);

	}

}
