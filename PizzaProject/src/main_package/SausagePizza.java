package main_package;

public class SausagePizza extends Pizza{

	public SausagePizza(String size) {
		super(size, "Sausage");
		this.toppings.add(new Sausage());
	}

}
