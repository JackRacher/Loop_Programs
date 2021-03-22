package loops;

import java.util.Scanner;

public class Prime_number_Program 
{

	public static void main(String[] args) 
	{
		String res = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the prime number range start and end values: ");
		int startValue = scanner.nextInt();
		int endValue = scanner.nextInt();
		for (int index = startValue; index <= endValue; index++) 
		{
			int i = 2, flag = 0;
			while(i < (index / 2))
			{
				if(index % i == 0)
				{
					flag = 1;
					break;
				}
				i++;
			}
			if(flag == 0)
			{
				res += index + ","; 
			}
		}
		System.out.println(res.substring(0, res.length()-1));
		scanner.close();
	}
}


