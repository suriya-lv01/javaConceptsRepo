package abstractFactoryPattern;

public class Test {

	public static void main(String[] args) {
			abstractDaoFactory adf= ProduceDaoFactory.produce("db");
			Dao myDao=adf.createDao("emp");
			myDao.save();
			
	}

}
