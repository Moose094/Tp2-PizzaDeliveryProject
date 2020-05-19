package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import main_package.Pepperoni;
import main_package.Pizza;

class TestPizza {
// testing pizza type, pizza price and pizza size
	@Test
	
	public void test_constructor_1() {
		Pizza p = new Pizza ("small", "Sausage");
		assertTrue(p.getPizzaType().contentEquals("Sausage"));
		assertTrue(p.getPizzaSize().contentEquals("small"));
	}
	
	@Test
	public void test_constructor_2() {
		Pizza p = new Pizza ("small");
		assertTrue(p.getPizzaType().contentEquals("Custom"));
		assertTrue(p.getPizzaSize().contentEquals("small"));
	}
	
	@Test
	public void test_get_price_small() {
		Pizza p = new Pizza("small");
		assertEquals(p.getPizzaPrice(),10);
	}
	
	@Test
	public void test_get_price_medium() {
		Pizza p = new Pizza("medium");
		assertEquals(p.getPizzaPrice(),13);
	}
	
	@Test
	public void test_get_price_large() {
		Pizza p = new Pizza("large");
		assertEquals(p.getPizzaPrice(),15);
	}
	
	@Test
	public void test_add_topping_price() {
		Pizza p = new Pizza("small");
		p.addTopping(new Pepperoni());
		assertEquals(p.getPizzaPrice(),11.5);
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

	@Test
	public void test_remove_topping_price() {
		Pizza p = new Pizza("small");
		p.addTopping(new Pepperoni());
		p.addTopping(new Pepperoni());
		p.removeTopping("pepperoni");
		assertEquals(p.getPizzaPrice(),11.5);
	}
	
	@Test
	public void test_toString() {
		Pizza p = new Pizza("small");
		p.addTopping(new Pepperoni());
		System.out.println(p.toString());
		assertTrue(
				p.toString().contentEquals(
						"small Custom Pizza (pepperoni, ) \n"
						+ "  $11.5"));
	}

}
