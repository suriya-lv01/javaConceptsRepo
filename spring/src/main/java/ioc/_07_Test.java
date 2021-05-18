package ioc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class _07_Test {

	public static void customInit() {
		System.out.println("Init method is called");
	}
	
	public static void customDestroy() {
		System.out.println("Destroy method is called");
	}
}
