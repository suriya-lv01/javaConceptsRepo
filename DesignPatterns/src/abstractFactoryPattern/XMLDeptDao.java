package abstractFactoryPattern;

public class XMLDeptDao implements Dao {

	@Override
	public void save() {
		System.out.println("saving dept data to xml");
	}

}
