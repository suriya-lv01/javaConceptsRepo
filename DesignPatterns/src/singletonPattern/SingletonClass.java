package singletonPattern;

public class SingletonClass {

	public static SingletonClass singletonClass = null;

	private SingletonClass() {

	}

	public static SingletonClass getSingletonClass() {

		if (singletonClass == null) {
			synchronized (SingletonClass.class) {
				if (singletonClass == null) {
					singletonClass = new SingletonClass();
				}

			}
		}
		return singletonClass;

	}

}
