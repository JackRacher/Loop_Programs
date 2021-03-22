package loops;

import java.util.Scanner;

public class For_Print_EvenNumber_Program 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String res = "";
		System.out.println("Enter the start value and the end value: ");
		int startValue = scanner.nextInt();
		int endValue = scanner.nextInt();
		if(startValue < endValue)
		{
			if(startValue % 2 != 0)
			{
				startValue += 1;
			}
			for (int index = startValue; index <= endValue; index += 2) 
			{
				res += index + " ";
			}
		}
		else
		{
			res += "Invalid";
		}
		System.out.println(res);
		scanner.close();
	}

}
