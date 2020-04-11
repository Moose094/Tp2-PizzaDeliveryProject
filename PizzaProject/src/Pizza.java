import java.util.ArrayList;

public class Pizza {
	double price;
	String type;
	String size;
	ArrayList<Topping> toppings = new ArrayList<Topping>();
	
	// constructor for initialization by subclasses
	public Pizza (String size, String type) {
		this.type = type;
		setPizzaSize(size);
	}
	
	// constructor for custom pizza
	public Pizza(String size) {
		this.type = "Custom";
		setPizzaSize(size);
	}
	
	// Accessing pizza price 
	
	public double getPizzaPrice() {
		return price;
	}
	
	// accessing pizza type
	public String getPizzaType() {
		return type;
	}
	
	// get pizza size
	public String getPizzaSize() {
		return size;
	}
	
	//this method adjusts the price of the pizza according to size
	public void setPizzaSize(String size) {
		this.size = size;
		
		if (size.equals("small"))
			this.price=10;
		else if (size.equals("medium"))
			this.price=13;
		else if (size.equals("large"))
			this.price=15;
	}
	
	public void addTopping(Topping topping) {
		toppings.add(topping);
		this.price+=topping.getPrice();
	}
	
	public void removeTopping(String topping) {
		for (Topping t : toppings) {
			if (t.getName().equals("topping"))
			{
				toppings.remove(t);
				break; //breaks out of for loop so it doesn't remove more than one topping
			}
		}
	}
	
	
}
