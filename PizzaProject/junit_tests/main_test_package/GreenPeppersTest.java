package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main_package.GreenPeppers;

class GreenPeppersTest {

@Test
	
	public void TestGreenPeppers() {
		GreenPeppers gp = new GreenPeppers ();
		assertTrue(gp.getName().contentEquals("green peppers"));
		assertEquals(.5, gp.getPrice());
	}


}
