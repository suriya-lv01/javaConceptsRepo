package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _09_DemoPropertiesFileDI {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/_09_bean.xml");
		_09_PropertiesImpl _09_PropertiesImpl = (_09_PropertiesImpl) ctx.getBean("pi");
		System.out.println(_09_PropertiesImpl.getPropName());
		System.out.println(_09_PropertiesImpl.getPropValue());

	}
}
