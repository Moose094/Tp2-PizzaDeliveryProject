package main_package;

public class SupremePizza extends Pizza {

	public SupremePizza(String size) {
		super(size, "Supreme");
		this.toppings.add(new BlackOlives());
		this.toppings.add(new GreenPeppers());
		this.toppings.add(new Sausage());
		this.toppings.add(new Onions());
	}

}
