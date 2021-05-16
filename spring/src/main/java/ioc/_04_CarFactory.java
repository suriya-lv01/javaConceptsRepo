package ioc;

import org.springframework.beans.factory.FactoryBean;

public class _04_CarFactory implements FactoryBean{
	
	private String carName;
	
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public Object getObject() throws Exception {
		// TODO Auto-generated method stub
		_04_Car car=(_04_Car)Class.forName(carName).newInstance();
		return car;
	}

	@Override
	public Class getObjectType() {
		// TODO Auto-generated method stub
		return _04_Car.class;
	}
	
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true; 
	}

}
