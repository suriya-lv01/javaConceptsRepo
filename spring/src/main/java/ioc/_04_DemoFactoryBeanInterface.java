package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Concept: FactoryBean interface to create bean objects
public class _04_DemoFactoryBeanInterface {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/_04_bean.xml");
		// here creating the factory bean actually creates a car implementaion
		_04_Car car = (_04_Car) ctx.getBean("carFactoryObj");
		car.drive();

	}

}
