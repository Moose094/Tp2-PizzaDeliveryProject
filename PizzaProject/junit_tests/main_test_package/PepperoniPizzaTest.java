package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PepperoniPizzaTest {

@Test
	// test case for pizza size

	public void TestPepperoniSize() {
		PepperoniPizza pp = new PepperoniPizza ("");
		pp.setPizzaSize("small");
		assertEquals("small", pp.getPizzaSize());
	
	}

@Test
// test case for pizza price

public void TestPepperoniPrice() {
	PepperoniPizza pp = new PepperoniPizza ("");
	pp.setPizzaSize("medium");
	assertEquals(13, pp.price);

}






}
