package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main_package.BlackOlives;

class TestBlackOlives {

@Test
	
	public void TestBlackOlives() {
		BlackOlives bO = new BlackOlives ();
		assertTrue(bO.getName().contentEquals("black olives"));
		assertEquals(.5, bO.getPrice());
	}

}
