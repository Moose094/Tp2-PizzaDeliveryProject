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
	
	// getter to access customer's first name 
	
	public String getfirstName() {
		return firstName;
	}	
	
	// getter to access customer's last name 
	
		public String getlirstName() {
			return lastName;
		}	
		
		// getter to access customer's address
		
		public String getaddress() {
			return address;
		}	
		
		// getter to access customer's email address
		
		public String emailAddress() {
			return emailAddress;
		}	
		
		// getter to access customer's phone number
		
		public String getphoneNumber() {
			return phoneNumber;
		}	


}
