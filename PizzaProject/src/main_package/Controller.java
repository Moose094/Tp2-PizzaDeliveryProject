package main_package;

import java.util.ArrayList;

//This will serve as our controller class between the UI and domain layers

public class Controller {

	Store store;
	Order currentOrder;
	Customer currentCustomer = new Customer();
	Pizza currentPizza;
	ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	
	public void startOrder()
	{
		currentOrder = new Order();
	}
	
	public void addPizza(String type, String size)
	{
		
		if ("custom".equals(type))
			currentPizza = new Pizza(size);
		else if ("pepperoni".equals(type))
			currentPizza = new PepperoniPizza(size);
		else if ("sausage".equals(type))
			currentPizza = new SausagePizza(size);
		else if ("supreme".contentEquals(type))
			currentPizza = new SupremePizza(size);
		else if ("hawaiian".equals(type))
			currentPizza = new HawaiianPizza(size);
		
		pizzas.add(currentPizza);
	}
	
	public void addTopping(String input) 
	{
		Topping topping = null;
		
		if ("bacon".equals(input))
			topping = new Bacon();
		if ("black olives".equals(input))
			topping = new BlackOlives();
		if ("canadianbacon".equals(input))
			topping = new CanadianBacon();
		if ("green peppers".equals(input))
			topping = new GreenPeppers();
		if ("jalepeno".equals(input))
			topping = new Jalepeno();
		if ("mushrooms".equals(input))
			topping = new Mushrooms();
		if ("onion".equals(input))
			topping = new Onions();
		if ("pepperoni".equals(input))
			topping = new Pepperoni();
		if ("pineapple".equals(input))
			topping = new Pineapple();
		if ("sausage".equals(input))
			topping = new Sausage();
		
		currentPizza.addTopping(topping);
	}
	
	public void removeTopping(String input)
	{
		currentPizza.removeTopping(input);
	}
	
	public void clearOrder() 
	{
		pizzas.clear();
	}
	
	public void addCustomerAddress(String input) 
	{
		currentCustomer.setAddress(input);
	}

	public void addCustomerName(String first, String last) 
	{
		currentCustomer.setFirstName(first);
		currentCustomer.setLastName(last);
	}
	
	public void addCustomerPhone(String input) 
	{
		currentCustomer.setPhoneNumber(input);
	}
	
	public void addCustomerEmail(String input) 
	{
		currentCustomer.setEmailAddress(input);
	}
	
	public String getOrderInfo() 
	{
		String s = "";
		String details = "";
		double t = 0;
		String total = ""; 
		
		for (Pizza p : pizzas) {
			details+=p+" \n";
			t += p.getPizzaPrice();
		}
		total += t;
		
		s += "Name: "+currentCustomer.getFirstName()+" "+currentCustomer.getLastName()+"\n"
				+"Email: "+currentCustomer.getEmailAddress()+"\n"
				+"Phone: "+currentCustomer.getphoneNumber()+"\n"
				+"Address: "+currentCustomer.getAddress()+"\n"
				+"Order Details: "+details+"\n"
				+"Total: "+total+"\n";
		
		return s;
	}
}
