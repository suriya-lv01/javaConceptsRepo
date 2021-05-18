package ioc;

public class _08_LookupMethodForConcreteClass {

	public _08_Engine myEngine() {

		_08_Engine newEngine = new _08_Engine();
		newEngine.setEngineName("Train Engine");
		return newEngine;
	};

}
