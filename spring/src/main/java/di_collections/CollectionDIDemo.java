package di_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionDIDemo {
	
	public static void main(String args[])
	{
		ApplicationContext context	=	new ClassPathXmlApplicationContext("di_collections/DataCollectionBean.xml");
		DataCollection DataCollectionObject	=	(DataCollection) context.getBean("DataCollectionBean");
		DataCollectionObject.getData();
	}

}
