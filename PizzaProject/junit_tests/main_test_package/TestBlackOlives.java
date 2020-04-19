import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBlackOlives {

@Test
	
	public void TestBlackOlives() {
		BlackOlives bO = new BlackOlives ();
		bO.name = "Black Olives";
		bO.price = .5;
		assertEquals("Black Olives", bO.name);
		assertEquals(.5, bO.price);
	}

}
