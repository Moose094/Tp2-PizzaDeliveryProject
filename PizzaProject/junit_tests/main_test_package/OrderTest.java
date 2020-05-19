package main_test_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main_package.Customer;
import main_package.Order;
import main_package.PepperoniPizza;

class OrderTest {

	@Test
	void test_add_pizza() {
		Order o = new Order();
		o.addPizza(new PepperoniPizza("small"));
		assertFalse(o.getPizzas().isEmpty());
	}
	
	@Test
	void test_clear_order() {
		Order o = new Order();
		o.addPizza(new PepperoniPizza("small"));
		o.clearOrder();
		assertTrue(o.getPizzas().isEmpty());
	}
	
	@Test
	void test_get_total() {
		Order o = new Order();
		o.addPizza(new PepperoniPizza("small"));
		assertTrue(o.getTotal().contentEquals("$11.50"));
	}
	
	@Test
	void test_add_customer() {
		Order o = new Order();
		o.setCustomer(new Customer());
		assertNotNull(o.getCustomer());
	}
	
	@Test
	void test_get_info() {
		Order o = new Order();
		o.addPizza(new PepperoniPizza("small"));
		System.out.println(o.getInfo());
		String seq = "small Pepperoni Pizza (pepperoni, ) \n  $11.5 \n";
		assertTrue(o.getInfo().contentEquals(seq));
	}

}
