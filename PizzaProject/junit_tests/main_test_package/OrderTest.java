package main_test_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main_package.Order;
import main_package.PepperoniPizza;

class OrderTest {

	@Test
	void test_add_pizza() {
		Order o = new Order();
		o.addPizza(new PepperoniPizza("small"));
		System.out.println(o.getTotal());
		assertTrue(o.getTotal().contentEquals("$11.50"));
	}

}
