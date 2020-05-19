package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HawaiianPizzaTest {
	@Test
	// test case for pizza size

	public void TestSausageSize() {
		HawaiianPizza hp = new HawaiianPizza ("");
		hp.setPizzaSize("small");
		assertEquals("small", hp.getPizzaSize());
	
	}

@Test
// test case for pizza price

public void TestPepperoniPrice() {
	HawaiianPizza hp = new HawaiianPizza ("");
	hp.setPizzaSize("medium");
	assertEquals(13, hp.price);

}

}
