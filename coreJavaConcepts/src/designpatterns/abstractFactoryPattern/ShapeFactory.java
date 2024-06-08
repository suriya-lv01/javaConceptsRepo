package AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory{
	@Override
	public Shape getShape(String shapetype)
	{
		if (shapetype == null)
		{
			return null;
		}
		else if(shapetype.equalsIgnoreCase("SQUARE"))
		{
			return new Square();
		}
		return null;
	}
	
	@Override
	   Color getColor(String color) {
	      return null;
	   }

}
