package loops;

import java.util.Scanner;

public class MenuDrivenApplication 
{
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		String res = "";
		int choice;
		while(true)
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
			choice = scanner.nextInt(); 
			switch (choice) 
			{
				case 1:
					System.out.println("Enter two values? ");
					res = "Sum = " + (scanner.nextInt() + scanner.nextInt());
					break;
				case 2:
					System.out.println("Enter two values? ");
					res = "Diffrence = " + (scanner.nextInt() - scanner.nextInt());
					break;
				case 3:
					System.out.println("Enter two values? ");
					res = "Product = " + (scanner.nextInt() * scanner.nextInt());
					break;
				case 4:
					System.out.println("Enter two values? ");
					res = "Division = " + (scanner.nextInt() / scanner.nextInt());
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
