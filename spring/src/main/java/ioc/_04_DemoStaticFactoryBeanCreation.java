package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _04_DemoStaticFactoryBeanCreation {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ioc/_04_bean.xml");
		_04_Car carObj	=	(_04_Car) ctx.getBean("carObj");
		carObj.drive();
	}

}
