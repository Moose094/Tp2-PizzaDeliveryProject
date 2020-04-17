package main_test_package;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main_package.Customer;

class TestCustomer {

	@Test
	// testing the customer constructor
	public void CustmonerTesting() {
Customer c = new Customer ("Lionel", "Ronaldo", "2 jerk st", "Ro@email.com", "555-555");
assertEquals("Lionel", c.getfirstName());
assertEquals("Ronaldo", c.getlastName());
assertEquals("2 jerk st", c.getAddress());
assertEquals("Ro@email.com", c.getEmailAddress());
assertEquals("555-555", c.getphoneNumber());

	}
}
