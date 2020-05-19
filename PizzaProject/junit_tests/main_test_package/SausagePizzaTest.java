package main_test_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main_package.SausagePizza;

class SausagePizzaTest {

	@Test
	void test_type() {
		SausagePizza sp = new SausagePizza("small");
		assertTrue(sp.getPizzaType().contentEquals("Sausage"));
	}
	
	@Test
	void test_size() {
		SausagePizza sp = new SausagePizza("small");
		assertTrue(sp.getPizzaSize().contentEquals("small"));
	}

}
