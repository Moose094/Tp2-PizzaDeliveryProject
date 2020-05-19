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

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SausagePizzaTest {

	@Test
	// test case for pizza size

	public void TestSausageSize() {
		SausagePizza sp = new SausagePizza ("");
		sp.setPizzaSize("small");
		assertEquals("small", sp.getPizzaSize());
	
	}

@Test
// test case for pizza price

public void TestPepperoniPrice() {
	SausagePizza sp = new SausagePizza ("");
	sp.setPizzaSize("medium");
	assertEquals(13, sp.price);

}

}
