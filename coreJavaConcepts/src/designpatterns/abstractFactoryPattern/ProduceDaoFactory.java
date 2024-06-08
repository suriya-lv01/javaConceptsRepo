package abstractFactoryPattern;

public class ProduceDaoFactory {
	public static abstractDaoFactory produce(String factoryType) {

		abstractDaoFactory adf = null;
		if (factoryType.equalsIgnoreCase("DB")) {
			adf = new DbDaoFactory();
		} else if (factoryType.equalsIgnoreCase("XML")) {
			adf = new XmlDaoFactory();
		}
		return adf;

	}
}
