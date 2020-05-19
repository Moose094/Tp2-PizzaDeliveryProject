package main_test_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main_package.HawaiianPizza;

class HawaiianPizzaTest {

	@Test
	void test_type() {
		HawaiianPizza hp = new HawaiianPizza("small");
		assertTrue(hp.getPizzaType().contentEquals("Hawaiian"));
	}
	
	@Test
	void test_size() {
		HawaiianPizza hp = new HawaiianPizza("small");
		assertTrue(hp.getPizzaSize().contentEquals("small"));
	}

}
