package main_package;
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
		
		if ("small".equals(size))
			this.price=10;
		else if ("medium".equals(size))
			this.price=13;
		else if ("large".equals(size))
			this.price=15;
	}
	
	public void addTopping(Topping topping) {
		toppings.add(topping);
		this.price+=topping.getPrice();
	}
	
	public void removeTopping(String topping) {
		for (Topping t : toppings) {
			if ("topping".equals(t.getName()))
			{
				toppings.remove(t);
				this.price-=t.getPrice();
				break; //breaks out of for loop so it doesn't remove more than one topping
			}
		}
	}
	
	public String toString()
	{
		String s = "";
		
		s+=type+" Pizza: ";
		for (Topping t : toppings)
		{
			s+=t.getName()+" ";
		}
		
		return s;
	}
	
	
}
