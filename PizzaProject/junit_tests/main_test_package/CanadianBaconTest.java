package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main_package.CanadianBacon;

class CanadianBaconTest {

@Test
	
	public void TestCanadianBacon() {
		CanadianBacon cb = new CanadianBacon ();

		assertTrue(cb.getName().contentEquals("canadian bacon"));
		assertEquals(1, cb.getPrice());
	}

}
