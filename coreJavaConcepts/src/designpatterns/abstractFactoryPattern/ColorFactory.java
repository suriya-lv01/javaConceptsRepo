package AbstractFactoryPattern;

public class ColorFactory extends AbstractFactory{
	@Override
	public Shape getShape(String shapetype)
	{
		return null;
	}
	
	@Override
	   Color getColor(String color) {
		if (color == null)
		{
			return null;
		}
		else if(color.equalsIgnoreCase("RED"))
		{
			return new Red();
		}
		return null;
	   }
}
