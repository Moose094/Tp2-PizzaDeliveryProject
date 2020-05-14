package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main_package.Pineapple;

class PineappleTest {

@Test
	
	public void TestPineapple() {
		Pineapple p = new Pineapple ();
		assertEquals("pineapple", p.getName());
		assertEquals(.45, p.getPrice());
	}
	

}
