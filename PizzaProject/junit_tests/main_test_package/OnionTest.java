import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OnionTest {

@Test
	
	public void TestOnion() {
		Onions o = new Onions ();
		o.name = "Onions";
		o.price = .25;
		assertEquals("Onions", o.name);
		assertEquals(.25, o.price);
	}
	

}
