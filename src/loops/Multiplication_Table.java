package loops;

import java.util.Scanner;

public class Multiplication_Table 
{
	public static void main(String[] args) 
	{
		String res = "";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Range(Start value and end value) to multiplcation tables: ");
		int startValue = scanner.nextInt();
		int range = scanner.nextInt();
		for (int number = startValue; number <= range; number++) 
		{
			for (int index = 1; index <= 10 ; index++) 
			{
				res += (number + " * " + index + " = " + index * number + "\n");
				
			}
			res += "-----------------------\n";
		}
		System.out.println(res);
		scanner.close();

	}

}
