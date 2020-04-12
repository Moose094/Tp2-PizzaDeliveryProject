import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Order {
	private Customer customer;
	private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	private BigDecimal total = new BigDecimal(0); 
	private DecimalFormat USD = new DecimalFormat("xx.xx");

	
	public void addPizza(Pizza pizza) {
		pizzas.add(pizza);
		total.add(BigDecimal.valueOf(pizza.getPizzaPrice()));
	}
	
	public void clearOrder() {
		pizzas.clear();
		total = new BigDecimal(0);
	}
	
	public String getTotal() {
		String monetaryTotal = "$"+USD.format(total.doubleValue());
		return monetaryTotal;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}
}
