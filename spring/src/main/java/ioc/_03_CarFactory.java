package ioc;

public class _03_CarFactory{
	
	private static String scarName;
	private String carName;
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}


	public static String getScarName() {
		return scarName;
	}

	public static void setScarName(String scarName) {
		_03_CarFactory.scarName = scarName;
	}
	
	@SuppressWarnings("deprecation")
	public _03_Car getCar() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		return (_03_Car)Class.forName(carName).newInstance();
	}
	
	@SuppressWarnings("deprecation")
	public static _03_Car getSCar() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		return (_03_Car)Class.forName(scarName).newInstance();
	}

}
