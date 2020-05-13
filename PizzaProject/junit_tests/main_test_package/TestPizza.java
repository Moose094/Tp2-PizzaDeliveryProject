package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPizza {
// testing pizza type, pizza price and pizza size
	@Test
	
	public void PizzaTesting() {
		Pizza p = new Pizza ("sausage", "small");
		p.setPizzaSize("small");
		p.type = "sausage";
		p.price = 10.0;
		assertEquals("sausage", p.getPizzaType());
		assertEquals(10.0, p.getPizzaPrice());
		assertEquals("small", p.getPizzaSize());
	}
	
	
	// testing that a small size matches with the price
		@Test
		
		public void PizzaSizeTesting() {
			Pizza p = new Pizza ("");
			p.setPizzaSize("small");
			assertEquals(10.0, p.getPizzaPrice());
		}
		
	
	// testing that a medium size matches with the price
				@Test
				
				public void PizzaSizeTesting1() {
					Pizza p = new Pizza ("");
					p.setPizzaSize("medium");
					assertEquals(13.0, p.getPizzaPrice());
				}
	// testing that a Large size matches with the price
				@Test
				
				public void PizzaSizeTesting2() {
					Pizza p = new Pizza ("");
					p.setPizzaSize("large");
					assertEquals(15.0, p.getPizzaPrice());
				}


}
