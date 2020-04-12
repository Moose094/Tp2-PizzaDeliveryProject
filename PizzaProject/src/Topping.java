
public abstract class Topping {
	
	String name;
	double price;
	
	// constructor for the topping class 
	public Topping(String name, double price) {
		
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
}
