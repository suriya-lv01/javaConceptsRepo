package abstractFactoryPattern;

public class DbDaoFactory extends abstractDaoFactory {

	Dao DbDao = null;

	@Override
	public Dao createDao(String type) {
		if (type.equalsIgnoreCase("emp")) {
			DbDao = new DbEmpDao();
		}
		else if(type.equalsIgnoreCase("dept")) {
			DbDao = new DbDeptDao();
		}
		return DbDao;
	}

}
