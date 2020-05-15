package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main_package.Store;

class TestStore {

	@Test
	void test_is_open() {
		Store s = new Store();
		assertTrue(s.isOpen());
	}
	
	@Test
	public void test_next_driver() {
		Store s = new Store();
		assertFalse(s.nextDriver().contentEquals(s.nextDriver()));
	}
}
