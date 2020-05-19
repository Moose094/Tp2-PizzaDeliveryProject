package main_test_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main_package.SupremePizza;

class SupremePizzaTest {

	@Test
	void test_type() {
		SupremePizza sp = new SupremePizza("small");
		assertTrue(sp.getPizzaType().contentEquals("Supreme"));
	}
	
	@Test
	void test_size() {
		SupremePizza sp = new SupremePizza("small");
		assertTrue(sp.getPizzaSize().contentEquals("small"));
	}

}
