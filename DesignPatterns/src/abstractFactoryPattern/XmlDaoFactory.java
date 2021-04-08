package abstractFactoryPattern;

public class XmlDaoFactory extends abstractDaoFactory {

	Dao xmlDao = null;

	@Override
	public Dao createDao(String type) {
		if (type.equalsIgnoreCase("emp")) {
			xmlDao = new XMLEmpDao();
		}
		else if(type.equalsIgnoreCase("dept")) {
			xmlDao = new XMLDeptDao();
		}
		return xmlDao;
	}

}
