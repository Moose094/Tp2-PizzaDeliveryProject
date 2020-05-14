package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main_package.Onions;

class OnionTest {

@Test
	
	public void TestOnion() {
		Onions o = new Onions ();
		assertEquals("Onions", o.getName());
		assertEquals(.25, o.getPrice());
	}
	

}
