package factoryPattern;

public class PizzaFactory {

	public static Pizza createPizza(String pizzaType) {
		Pizza p = null;
		if (pizzaType.equalsIgnoreCase("veggie")) {
			p = new VeggiePizza();
		} else if (pizzaType.equalsIgnoreCase("cheese")) {
			p = new CheesePizza();
		}

		return p;
	}
}
