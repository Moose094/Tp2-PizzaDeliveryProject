package main_package;
// creating customer class 
public class Customer {
	
	String firstName;
	String lastName;
	String address;
	String emailAddress;
	String phoneNumber;
	
	
	// constructor to initialize the customer class
	
	public Customer(String firstName, String lastName, String address, String emailAddress, String phoneNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
	}
	
	
	//in case we just want to initialize customer and set all those values later
	public Customer() {}
	
	
	// getter to access customer's first name 
	
	public String getfirstName() {
		return firstName;
	}	
	
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	
	// getter to access customer's last name 
	
	public String getlastName() {
		return lastName;
	}	
	
	public void setLastName(String name){
		this.lastName = name;
	}
	
	
	
	// getter to access customer's address
		
	public String getAddress() {
		return address;
	}	
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	// getter to access customer's email address
		
	public String getEmailAddress() {
		return emailAddress;
	}	
	
	public void setEmailAddress(String email) {
		this.emailAddress = email;
	}
		
	// getter to access customer's phone number
		
	public String getphoneNumber() {
		return phoneNumber;
	}	
	
	public void setPhoneNumber(String number) {
		this.phoneNumber = number;
	}
		
		


}
