package loops;

import java.util.Scanner;

public class MenuDrivenUsingMethods 
{
	static Scanner scanner = new Scanner(System.in);
	static void menu()
	{
		String  menu = "";
		menu += "Menu Driven Application\n";
		menu += "1. Addition\n";
		menu += "2. Substraction\n";
		menu += "3. Multiplication\n";
		menu += "4. Division\n";
		menu += "5. Exit\n";
		menu += "Select the choice: ";
		System.out.println(menu);
	}
	
	static int addition(int num1, int num2)
	{
		return (num1 + num2);
	}
	
	static int substraction(int num1, int num2)
	{
		return (num1 - num2);
	}
	
	static int multiplication(int num1, int num2)
	{
		return (num1 * num2);
	}
	
	static int division(int num1, int num2)
	{
		return (num1 / num2);
	}
	
	static void accept()
	{
		System.out.println("Enter two values: ");
	}
	
	public static void main(String[] args) 
	{
		
		String res = "";
		while(true)
		{
			menu();
			int choice = scanner.nextInt();
			switch (choice) 
			{
				case 1:
					accept();
					res = "Sum = " + addition(scanner.nextInt(), scanner.nextInt());
					break;
				case 2:
					accept();
					res = "Difference = " + substraction(scanner.nextInt(), scanner.nextInt());
					break;
				case 3:
					accept();
					res = "Product = " + multiplication(scanner.nextInt(), scanner.nextInt());
					break;
				case 4:
					accept();
					res = "division = " + division(scanner.nextInt(), scanner.nextInt());
					break;
				case 5:
					System.exit(0);
					break;
				default:
					res = "Invalid Choice";
					break;
			}
			System.out.println(res);
		}
	}
}
