package Jaxb;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class unmarshallclass {

	/**
	 * @param filename
	 */
	public static void jaxxmlToObject(String filename) {
		File inFile = new File(filename);
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance(Employee.class);
			Unmarshaller um = jc.createUnmarshaller();

			Employee emp = (Employee) um.unmarshal(inFile);
			System.out.println(emp);
		} catch (Exception e) {
				e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		String filename = "C:\\Users\\suriy\\git\\javaConceptsRepo\\coreJavaConcepts\\src\\Jaxb\\employee.xml";
		jaxxmlToObject(filename);

	}

}
