package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PineappleTest {

@Test
	
	public void TestPineapple() {
		Pineapple p = new Pineapple ();
		p.name = "pineapple";
		p.price = .45;
		assertEquals("pineapple", p.name);
		assertEquals(.45, p.price);
	}
	

}
