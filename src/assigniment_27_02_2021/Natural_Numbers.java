package assigniment_27_02_2021;

import java.util.Scanner;

public class Natural_Numbers 
{
	public static void main(String[] args) 
	{
		String res = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range of natural number to print give the end value: ");
		int endValue = scanner.nextInt();
		for (int index = 1; index < endValue; index++)
		{
			res += index + " ";
			
		}
		System.out.println(res);
		scanner.close();
	}

}
