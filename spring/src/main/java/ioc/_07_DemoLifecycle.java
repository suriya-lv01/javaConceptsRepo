package ioc;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _07_DemoLifecycle {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/_07_bean.xml");
		_07_Test testObj = (_07_Test) ctx.getBean("testObj");
		ctx.close();
	}
}
