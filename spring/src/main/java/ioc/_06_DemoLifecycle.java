package ioc;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _06_DemoLifecycle {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/_06_bean.xml");
		_06_Test testObj = (_06_Test) ctx.getBean("testObj");
		System.out.println(testObj.getProp1());
		testObj.processMethod();
		ctx.close();
	}
}
