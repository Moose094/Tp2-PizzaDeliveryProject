package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main_package.Jalepeno;

class JalepenoTest {

@Test
	
	public void TestJalepeno() {
		Jalepeno j = new Jalepeno ();
		assertTrue(j.getName().contentEquals("jalepeno"));
		assertEquals(.5, j.getPrice());
	}

}
