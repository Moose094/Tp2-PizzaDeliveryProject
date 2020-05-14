package main_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PizzaUI 
{
	static String frontPage = string_from_file(new File("src/main_package/front-page.txt"));
	static String selectPizza = string_from_file(new File("src/main_package/select-pizza.txt"));
	static String sizeMenu = string_from_file(new File("src/main_package/size-menu.txt"));
	static String toppingMenu = string_from_file(new File("src/main_package/topping-menu.txt"));
	static String modMenu = string_from_file(new File("src/main_package/modification-screen.txt"));
	
	static Boolean running;
	static Scanner scan = new Scanner(System.in);
	static String input;
	
	static Controller app = new Controller();

	public static void main(String args[])
	{
		running = true;
		
		
		while (running)
		{
			
			System.out.println(frontPage);
			
			input = scan.nextLine();
			switch (input)
			{
			case "1":
				addPizza();
				break;
			case "2":
				try {
				app.clearOrder();
				System.out.println("Your order has been cleared");
				} catch (NullPointerException e) {
					System.out.println("Nothing to clear!");
				}
				break;
			case "3":
				System.out.println(app.getOrderInfo());
				break;
			case "4":
				//completeOrder();
				running = false;
				break;
			case "5":
				System.out.println("Goodbye");
				running = false;
				break;
			default:
				System.out.println("Invalid Selection");
			}

		}
		
	}
	
	public static String string_from_file(File file)
	{
		String s =  "";
		try 
		{
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine())
			{
				s += sc.nextLine()+"\n";
			}
			
		} 
		catch (FileNotFoundException e) 
		{
			s+=("Missing one or more menu files, please ensure files are in src folder.");
		}
		
		return s;
	}
	
	public static void addPizza() 
	{
		String size = null;
		boolean inMenu;
		
		inMenu = true;
		while (inMenu)
		{
			System.out.println(sizeMenu);
			size = scan.nextLine();
			size = parseSize(size);
			if (!size.equals("invalid"))
				inMenu=false;
			else
				System.out.println("Invalid Input!");
		}

		inMenu = true;
		while (inMenu)
		{
			System.out.println(selectPizza);
			input = scan.nextLine();
			
			switch (input)
			{
			case "1":
				app.newPizza("pepperoni",size);
				inMenu = false;
				break;
			case "2":
				app.newPizza("sausage", size);
				inMenu = false;
				break;
			case "3":
				app.newPizza("supreme", size);
				inMenu = false;
				break;
			case "4":
				app.newPizza("hawaiian", size);
				inMenu = false;
				break;
			case "5":
				app.newPizza("custom", size);
				inMenu = false;
				break;
			default:
				System.out.println("Invalid selection");
			}
		}
		
		
		inMenu = true;
		while (inMenu)
		{
			System.out.println(modMenu);
			input = scan.nextLine();
			
			switch (input)
			{
			case "1":
				System.out.println("What would you like to add?");
				System.out.println(toppingMenu);
				input = scan.nextLine();
				input = parseTopping(input);
				if (!input.equals("invalid"))
					app.addTopping(input);
				else
					System.out.println("Invalid Input!");
				break;
			case "2":
				System.out.println("What would you like to remove?");
				System.out.println(toppingMenu);
				input = scan.nextLine();
				input = parseTopping(input);
				if (!input.equals("invalid"))
					app.removeTopping(input);
				else
					System.out.println("Invalid Input!");
				break;
			case "3":
				System.out.println(sizeMenu);
				input = scan.nextLine();
				input = parseSize(input);
				if (!input.equals("invalid"))
					app.changeSize(input);
				else
					System.out.println("Invalid Input!");
				break;
			case"4":
				System.out.println(app.getPizzaInfo());
				break;
			case "5":
				app.addPizza();
				inMenu = false;
			}
		}
		
	}
	
	public static String parseTopping(String input)
	{
//		Based off of the following options:
//			____________________
//			|                  |
//			|Which topping?    |
//			|                  |
//			|1. Bacon          |
//			|2. Black Olives   |
//			|3. Canadian Bacon |
//			|4. Green Peppers  |
//			|5. Jalepeno       |
//			|6. Mushrooms      |
//			|7. Onions         |
//			|8. Pepperoni      |
//			|9. Pineapple      |
//			|10. Sausage       |
//			|__________________|
		
		switch (input)
		{
		case "1":
			return "bacon";
		case "2":
			return "black olives";
		case "3":
			return "canadian bacon";
		case "4":
			return "green peppers";
		case "5":
			return "jalepeno";
		case "6":
			return "mushrooms";
		case "7": 
			return "onions";
		case "8":
			return "pepperoni";
		case "9":
			return "pineapple";
		case "10":
			return "sausage";
		default:
			return "invalid";
		}
		
	}
	
	public static String parseSize(String input)
	{
//		Based off the following options:
//			_____________
//			|           |
//			|What size? |
//			|           |
//			|1. Small   |
//			|2. Medium  |
//			|3. Large   |
//			|___________|
		
		switch (input)
		{
		case "1":
			return "small";
		case "2":
			return "medium";
		case "3":
			return "large";
		default: 
			return "invalid";
		}
	}
	
	
}
