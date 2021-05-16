package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _02_privateContructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ioc/_02_bean.xml");
		_02_privateSingletonClass psc=(_02_privateSingletonClass) ctx.getBean("psc");
	}

}
