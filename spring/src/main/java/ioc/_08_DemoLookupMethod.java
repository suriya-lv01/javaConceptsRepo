package ioc;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _08_DemoLookupMethod {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/_08_bean.xml");
		
		System.out.println("Lookup Method for an interface-----------------");
		_08_LookupMethodForInterface intLookupMethod = (_08_LookupMethodForInterface) ctx.getBean("ilm");
		System.out.println("My engine type is "+intLookupMethod.myEngine().getEngineName());
		
		System.out.println("Lookup Method for an abstract class-----------------");
		_08_LookupMethodForAbstractClass abscLookupMethod = (_08_LookupMethodForAbstractClass) ctx.getBean("lmac");
		System.out.println("My engine type is "+abscLookupMethod.myEngine().getEngineName());
		
		System.out.println("Lookup Method for a concrete class-----------------");
		_08_LookupMethodForConcreteClass ccLookupMethod = (_08_LookupMethodForConcreteClass) ctx.getBean("lmcc");
		System.out.println("My engine type is "+ccLookupMethod.myEngine().getEngineName());
	}
}
