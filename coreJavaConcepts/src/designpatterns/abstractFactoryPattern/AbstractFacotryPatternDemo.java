package AbstractFactoryPattern;

public class AbstractFacotryPatternDemo {
	public static void main(String args[])
	{
		AbstractFactory shapeFactory	=	FactoryProducer.getFactory("SHAPE");
		Shape SquObj=	shapeFactory.getShape("SQUARE");
		SquObj.draw();
		
		AbstractFactory shapeFactory1	=	FactoryProducer.getFactory("COLOR");
		Color colObj=	shapeFactory1.getColor("RED");
		colObj.fill();
	}

}
