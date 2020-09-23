package xslt;

import java.io.File;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class xsltTransform {
	
	public static void main(String[] args) throws TransformerException 
	{
		String currentDirectory = System.getProperty("user.dir");
		Source xsltFile = new StreamSource(new File(currentDirectory + "/src/transform.xslt"));
		Source inputFile = new StreamSource(new File(currentDirectory + "/src/input.xml"));
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer(xsltFile);
		transformer.transform(inputFile, new StreamResult(new File(currentDirectory + "/src/output.xml")));

		
	}
	

}
