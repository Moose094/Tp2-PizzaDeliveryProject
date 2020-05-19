package main_test_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main_package.Bacon;

class BaconTest {

	@Test
	void test_name() {
		Bacon bacon = new Bacon();
		assertTrue(bacon.getName().contentEquals("bacon"));
	}
	
	@Test
	void test_price() {
		Bacon bacon = new Bacon();
		assertEquals(bacon.getPrice(),1.25);
	}

}
