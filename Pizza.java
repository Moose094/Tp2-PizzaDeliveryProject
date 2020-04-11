
public class Pizza {
	double price;
	String type;
	String Topping [] ;
	
	// constructor to initialize the pizza class 
	public Pizza (double price, String type) {
		
		this.price = price;
		this.type = type;
	}
	
	// Accessing pizza price 
	
	public double getpizzaPrice() {
		return price;
	}
	
	// accessing pizza type
	public String getpizzaType() {
		return type;
	}

}
