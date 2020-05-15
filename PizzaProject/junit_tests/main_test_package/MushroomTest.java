package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main_package.Mushrooms;

class MushroomsTest {
	
@Test
	
	public void TestMushrooms() {
		Mushrooms m = new Mushrooms ();
		assertTrue(m.getName().contentEquals("mushrooms"));
		assertEquals(.5, m.getPrice());
	}

	
}
