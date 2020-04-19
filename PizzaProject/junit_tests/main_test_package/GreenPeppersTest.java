package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreenPeppersTest {

@Test
	
	public void TestGreenPeppers() {
		GreenPeppers gp = new GreenPeppers ();
		gp.name = "Green Peppers";
		gp.price = .5;
		assertEquals("Green Peppers", gp.name);
		assertEquals(.5, gp.price);
	}


}
