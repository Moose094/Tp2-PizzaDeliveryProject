package main_package;

public class PepperoniPizza extends Pizza{

	public PepperoniPizza(String size) {
		super(size, "Pepperoni");
		this.toppings.add(new Pepperoni());
	}

}
