package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CanadianBaconTest {

@Test
	
	public void TestCanadianBacon() {
		CanadianBacon cb = new CanadianBacon ();
		cb.name = "Canadian Bacon";
		cb.price = 1;
		assertEquals("Canadian Bacon", cb.name);
		assertEquals(1, cb.price);
	}

}
