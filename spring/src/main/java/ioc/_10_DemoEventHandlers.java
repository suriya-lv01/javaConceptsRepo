package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class _10_DemoEventHandlers {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("ioc/_10_bean.xml");
		ctx.start();
		ctx.stop();
		ctx.close();
		ctx.refresh();

	}
}
