package main_test_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main_package.Pineapple;
import main_package.Sausage;

class SausageTest {

@Test
	
	public void TestSausage() {
		Sausage s = new Sausage();
		assertTrue(s.getName().contentEquals("sausage"));
		assertEquals(1.25, s.getPrice());
	}
	
}
