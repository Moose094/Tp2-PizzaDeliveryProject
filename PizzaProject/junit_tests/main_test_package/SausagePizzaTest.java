import static org.junit.jupiter.api.Assertions.*;

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
