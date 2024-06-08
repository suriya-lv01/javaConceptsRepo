package abstractFactoryPattern;

public class DbDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("saving dept data to db");
	}

}
