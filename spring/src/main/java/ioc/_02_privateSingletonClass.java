package ioc;

public class _02_privateSingletonClass {

	private static _02_privateSingletonClass psc;

	private _02_privateSingletonClass() {
		System.out.println("Private constructor of singleton class");
	}

	public static _02_privateSingletonClass getPrivateSingletonClass() {
		if (psc == null) {
			psc=new _02_privateSingletonClass();
			return psc;
		}
		else {
		return psc;	
		}
	}

}
