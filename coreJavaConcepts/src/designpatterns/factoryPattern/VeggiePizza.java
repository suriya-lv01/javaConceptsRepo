package factoryPattern;

public class VeggiePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("preparing veggie pizza");

	}

	@Override
	public void bake() {
		System.out.println("baking veggie pizza");

	}

	@Override
	public void cut() {
		System.out.println("cutting veggie pizza");

	}

}
