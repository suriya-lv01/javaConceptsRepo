package ioc;

public class _04_CarFactory {

	private static String carName;

	public static String getCarName() {
		return carName;
	}

	public static void setCarName(String carName) {
		_04_CarFactory.carName = carName; 
	}

	public static _04_Car getCarObject() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return (_04_Car) Class.forName(carName).newInstance();
	}

}
