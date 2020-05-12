package main_package;
import java.util.ArrayList;
import java.util.Scanner;
public class PizzaApp {
	public static void Main(String[]args) {
		Scanner input = new Scanner(System.in);
		
	System.out.println("Welcome!");
	
	// Asking for customer information
	System.out.println("insert first name ," + "last name, " + "phone number," + "address");
	String firstName = input.next();
	String lastName = input.next();
	String phoneNumber = input.next();
	String address = input.next();
	
	// pizza menu
	/*I will add more later, just vaguely doing what I was thinking and see if 
	 * you had another idea in mind 
	 */
	System.out.println("Below is the Menu ");
	
	System.out.println("===================MENU==============================================");
	System.out.println("1 Sausage Pizza");
	System.out.println("2 Hawaiian Pizza");
	System.out.println("3 Pepperoni Pizza");
    System.out.println("=======================================================================)");
    
    // customer's options 
    
    Scanner option = new Scanner(System.in);
    
    if (option = 1) {
    	
    	Order order = new Order();
    	ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
    	pizzas.add("Sausage Pizza");
    	order.total = "15.50";
    	System.out.println("your order will be delivered at" + address);
    	System.out.println(" Thanks for ordering!");
    	
    }
    
    else if (option = 2) {
    	Order order = new Order();
    	ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
    	pizzas.add("Hawaiian Pizza");
    	order.total = "17.50";
    	System.out.println("your order will be delivered at" + address);
    	System.out.println(" Thanks for ordering!");
	

}
}
