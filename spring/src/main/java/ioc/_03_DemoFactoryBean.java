package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _03_DemoFactoryBean {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/_03_bean.xml");
		_03_Car car	=	(_03_Car) ctx.getBean("carObj");
		car.drive();
		
	}

}
