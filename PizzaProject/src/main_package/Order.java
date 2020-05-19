package main_package;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Order {
	private Customer customer;
	private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	private BigDecimal total = new BigDecimal(0); 
	private DecimalFormat USD = new DecimalFormat("00.00");

	
	public void addPizza(Pizza pizza) {
		pizzas.add(pizza);
		total = total.add(new BigDecimal(pizza.getPizzaPrice()));
	}
	
	public void clearOrder() {
		pizzas.clear();
		total = new BigDecimal(0);
	}
	
	public String getTotal() {
		String monetaryTotal = "$"+USD.format(total.doubleValue());
		return monetaryTotal;
	}
	
	public String getInfo() {
		String s = "";
		for (Pizza p : pizzas) {
			s+=p+" \n";
		}
		return s;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}
	
	public ArrayList<Pizza> getPizzas()
	{
		return pizzas;
	}
}
