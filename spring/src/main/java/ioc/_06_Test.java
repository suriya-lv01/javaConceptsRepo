package ioc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class _06_Test implements InitializingBean, DisposableBean {

	private static String prop1;

	public static void setProp1(String prop1) {
		_06_Test.prop1 = prop1;
		System.out.println("Prop1 is now set");
	}

	public static String getProp1() {
		return prop1;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean init block called after properties are set");

	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean destroy method after processing is complete");

	}

	public void processMethod() {
		System.out.println("Doing some processing");
	}

}
