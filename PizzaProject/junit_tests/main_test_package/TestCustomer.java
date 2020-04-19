package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main_package.Customer;

class TestCustomer {

	@Test
	// testing the customer constructor
	public void CustomerTesting() {
Customer c = new Customer ("Lionel", "Ronaldo", "2 jerk st", "Ro@email.com", "555-555");
assertEquals("Lionel", c.getfirstName());
assertEquals("Ronaldo", c.getlastName());
assertEquals("2 jerk st", c.getAddress());
assertEquals("Ro@email.com", c.getEmailAddress());
assertEquals("555-555", c.getphoneNumber());

	}
	
	@Test
	public void test_first_name() {
		Customer c = new Customer();
		c.setFirstName("asdef");
		assertEquals(c.getfirstName(),"asdef");
	}

	
	@Test
	public void test_last_name() {
		Customer c = new Customer();
		c.setLastName("qwer");
		assertEquals(c.getlastName(),"qwer");
	}
	
	
	@Test	
	public void test_address() {
		Customer c = new Customer();
		c.setAddress("4545 sunshine way");
		assertEquals(c.getAddress(),"4545 sunshine way");
	}
	
	@Test	
	public void test_email() {
		Customer c = new Customer();
		c.setEmailAddress("asdf@qwer.as");
		assertTrue(c.getEmailAddress().equals("asdf@qwer.as"));
	}
	
	@Test
	public void test_phone_num() {
		Customer c = new Customer();
		c.setPhoneNumber("12345678901");
		assertEquals(c.getphoneNumber(),"12345678901");
	}
	
}

