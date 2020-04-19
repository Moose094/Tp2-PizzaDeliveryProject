package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JalepenoTest {

@Test
	
	public void TestJalepeno() {
		Jalepeno j = new Jalepeno ();
		j.name = "Jalepeno";
		j.price = .5;
		assertEquals("Jalepeno", j.name);
		assertEquals(.5, j.price);
	}

}
