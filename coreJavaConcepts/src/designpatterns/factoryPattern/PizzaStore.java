package factoryPattern;

public class PizzaStore {
	public Pizza deliverPizza(String pizzaType) {
		Pizza p = PizzaFactory.createPizza(pizzaType);

		p.prepare();
		p.bake();
		p.cut();
		return p;
	}

	public static void main(String args[]) {
		PizzaStore ps = new PizzaStore();
		ps.deliverPizza("CHEESE");
	}
}