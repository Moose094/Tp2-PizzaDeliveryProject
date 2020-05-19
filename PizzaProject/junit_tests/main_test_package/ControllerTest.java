package main_test_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main_package.Controller;

class ControllerTest {

	@Test
	void test_start_order() {
		Controller c = new Controller();
		c.startOrder();
		assertNotNull(c.getOrder());
	}

	@Test
	void test_new_pizza_custom() {
		Controller c = new Controller();
		c.newPizza("custom", "small");
		assertTrue(c.getCurrentPizza().getPizzaType().contentEquals("Custom"));
	}
	
	@Test
	void test_new_pizza_pep() {
		Controller c = new Controller();
		c.newPizza("pepperoni", "small");
		assertTrue(c.getCurrentPizza().getPizzaType().contentEquals("Pepperoni"));
	}
	@Test
	void test_new_pizza_saus() {
		Controller c = new Controller();
		c.newPizza("sausage", "small");
		assertTrue(c.getCurrentPizza().getPizzaType().contentEquals("Sausage"));
	}
	@Test
	void test_new_pizza_haw() {
		Controller c = new Controller();
		c.newPizza("hawaiian", "small");
		assertTrue(c.getCurrentPizza().getPizzaType().contentEquals("Hawaiian"));
	}
	@Test
	void test_new_pizza_sup() {
		Controller c = new Controller();
		c.newPizza("supreme", "small");
		assertTrue(c.getCurrentPizza().getPizzaType().contentEquals("Supreme"));
	}
	
	@Test
	void test_add_pizza() {
		Controller c = new Controller();
		c.startOrder();
		c.newPizza("custom", "small");
		c.addPizza();
		assertFalse(c.getOrder().getPizzas().isEmpty());
	}
	
	@Test
	void test_add_topping_bacon() {
		Controller c = new Controller();
		c.newPizza("custom", "small");
		double oldPrice = c.getCurrentPizza().getPizzaPrice();
		c.addTopping("bacon");
		double newPrice = c.getCurrentPizza().getPizzaPrice();
		assertTrue(newPrice > oldPrice);
	}
	
	@Test
	void test_add_topping_bo() {
		Controller c = new Controller();
		c.newPizza("custom", "small");
		double oldPrice = c.getCurrentPizza().getPizzaPrice();
		c.addTopping("black olives");
		double newPrice = c.getCurrentPizza().getPizzaPrice();
		assertTrue(newPrice > oldPrice);
	}
	
	@Test
	void test_add_topping_cb() {
		Controller c = new Controller();
		c.newPizza("custom", "small");
		double oldPrice = c.getCurrentPizza().getPizzaPrice();
		c.addTopping("canadian bacon");
		double newPrice = c.getCurrentPizza().getPizzaPrice();
		assertTrue(newPrice > oldPrice);
	}
	
	@Test
	void test_add_topping_gp() {
		Controller c = new Controller();
		c.newPizza("custom", "small");
		double oldPrice = c.getCurrentPizza().getPizzaPrice();
		c.addTopping("green peppers");
		double newPrice = c.getCurrentPizza().getPizzaPrice();
		assertTrue(newPrice > oldPrice);
	}
	
	@Test
	void test_add_topping_jal() {
		Controller c = new Controller();
		c.newPizza("custom", "small");
		double oldPrice = c.getCurrentPizza().getPizzaPrice();
		c.addTopping("jalepeno");
		double newPrice = c.getCurrentPizza().getPizzaPrice();
		assertTrue(newPrice > oldPrice);
	}
	
	@Test
	void test_add_topping_mush() {
		Controller c = new Controller();
		c.newPizza("custom", "small");
		double oldPrice = c.getCurrentPizza().getPizzaPrice();
		c.addTopping("mushrooms");
		double newPrice = c.getCurrentPizza().getPizzaPrice();
		assertTrue(newPrice > oldPrice);
	}
	
	@Test
	void test_add_topping_onions() {
		Controller c = new Controller();
		c.newPizza("custom", "small");
		double oldPrice = c.getCurrentPizza().getPizzaPrice();
		c.addTopping("onions");
		double newPrice = c.getCurrentPizza().getPizzaPrice();
		assertTrue(newPrice > oldPrice);
	}
	
	@Test
	void test_add_topping_pep() {
		Controller c = new Controller();
		c.newPizza("custom", "small");
		double oldPrice = c.getCurrentPizza().getPizzaPrice();
		c.addTopping("pepperoni");
		double newPrice = c.getCurrentPizza().getPizzaPrice();
		assertTrue(newPrice > oldPrice);
	}
	
	@Test
	void test_add_topping_pine() {
		Controller c = new Controller();
		c.newPizza("custom", "small");
		double oldPrice = c.getCurrentPizza().getPizzaPrice();
		c.addTopping("pineapple");
		double newPrice = c.getCurrentPizza().getPizzaPrice();
		assertTrue(newPrice > oldPrice);
	}
	
	@Test
	void test_add_topping_saus() {
		Controller c = new Controller();
		c.newPizza("custom", "small");
		double oldPrice = c.getCurrentPizza().getPizzaPrice();
		c.addTopping("sausage");
		double newPrice = c.getCurrentPizza().getPizzaPrice();
		assertTrue(newPrice > oldPrice);
	}
	
	@Test
	void test_remove_topping() {
		Controller c = new Controller();
		c.newPizza("custom", "small");
		double oldPrice = c.getCurrentPizza().getPizzaPrice();
		c.addTopping("bacon");
		c.removeTopping("bacon");
		double newPrice = c.getCurrentPizza().getPizzaPrice();
		assertTrue(newPrice == oldPrice);
	}
	
	@Test
	void test_change_size() {
		Controller c = new Controller();
		c.newPizza("custom", "small");
		c.changeSize("large");
		assertTrue(c.getCurrentPizza().getPizzaSize().contentEquals("large"));
	}
	
	@Test
	void test_clear_order() {
		Controller c = new Controller();
		c.startOrder();
		c.newPizza("custom", "small");
		c.addPizza();
		c.clearOrder();
		assertTrue(c.getOrder().getPizzas().isEmpty());
	}
	
	@Test
	void test_add_address() {
		Controller c = new Controller();
		c.addCustomerAddress("anything");
		assertTrue(c.getCurrentCustomer().getAddress().contentEquals("anything"));
	}
	
	@Test
	void test_add_name_f() {
		Controller c = new Controller();
		c.addCustomerName("anything","at all");
		assertTrue(c.getCurrentCustomer().getFirstName().contentEquals("anything"));
	}
	
	@Test
	void test_add_name_l() {
		Controller c = new Controller();
		c.addCustomerName("anything","at all");
		assertTrue(c.getCurrentCustomer().getLastName().contentEquals("at all"));
	}
	
	@Test
	void test_add_phone() {
		Controller c = new Controller();
		c.addCustomerPhone("anything");
		assertTrue(c.getCurrentCustomer().getphoneNumber().contentEquals("anything"));
	}
	
	@Test
	void test_add_email() {
		Controller c = new Controller();
		c.addCustomerEmail("anything");
		assertTrue(c.getCurrentCustomer().getEmailAddress().contentEquals("anything"));
	}
	
}
