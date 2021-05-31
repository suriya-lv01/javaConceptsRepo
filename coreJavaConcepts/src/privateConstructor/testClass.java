package privateConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class testClass {

	public static void main(String args[]) {

		// In order to create a new instance of a class that has private constructor we
		// can do as follows
		try {
			Class c = Class.forName("privateConstructor.pvtConsClass");
			Constructor con[] = c.getDeclaredConstructors();
			con[0].setAccessible(true);
			con[0].newInstance();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
