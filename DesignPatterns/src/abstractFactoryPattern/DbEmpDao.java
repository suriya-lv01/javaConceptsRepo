package abstractFactoryPattern;

public class DbEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("saving emp data to db");
	}

}
