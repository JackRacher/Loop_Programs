package loops;

import java.util.Scanner;

public class Method_Programs 
{
	static Scanner scanner = new Scanner(System.in);
	static void display()
	{
		System.out.println("Welcome");
	}
	
	static void sum(int num1, int num2)
	{
		System.out.println("SUM = " + (num1 + num2));
	}
	
	static int product(int num1, int num2)
	{
		return num1 * num2;
	}
	
	static String wish()
	{
		return "Hello";
	}
	
	static boolean isEven(int num)
	{
		return (num % 2 == 0);
	}
			
	public static void main(String[] args) 
	{
		display();
		sum(10, 20);
		System.out.println("PRODUCT = " + product(2, 5));
		System.out.println(wish());
		System.out.println("Enter any number: ");
		if(isEven(scanner.nextInt()))
		{
			System.out.println("EVEN NUMBER");
		}
		else
		{
			System.out.println("ODD NUMBER");
		}
	}

}
