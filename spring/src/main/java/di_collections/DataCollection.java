package di_collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DataCollection {

	private List fruits;
	private Set cricketers;
	private Map countryCapital;

	public void setFruits(List fruits) {
		this.fruits = fruits;
	}

	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}

	public void setCountryCapital(Map countryCapital) {
		this.countryCapital = countryCapital;
	}

	public void getData() {
		System.out.println("Fruits......");
		for (Object fruit : fruits) {
			System.out.println(fruit);
		}

		System.out.println("Cricketers.........");
		for (Object cricketer : cricketers) {
			System.out.println(cricketer);
		}
		
		System.out.println("Country and Capital");
		Set keySet	=	countryCapital.keySet();
		for(Object key:keySet)
		{
			System.out.println("Country="+key+" Capital="+countryCapital.get(key));
		}
	}

}
