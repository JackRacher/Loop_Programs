package loops;

import java.util.Scanner;

public class RussianMultiplication 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two values to do russian multiplication: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int sum = 0;
        while(num1 != 0)
        {
        	 if(num1 % 2 != 0)
                 sum = sum + num2;
            num1 = num1 / 2;
            num2 = num2 * 2;
        }
        System.out.println("The product is: "+sum);
        scanner.close();
	}

}
