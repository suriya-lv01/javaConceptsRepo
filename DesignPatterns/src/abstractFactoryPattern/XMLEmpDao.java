package abstractFactoryPattern;

public class XMLEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("saving emp data to xml");
	}

}
