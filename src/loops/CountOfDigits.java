package loops;

import java.util.Scanner;

public class CountOfDigits {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find the digits in it: ");
		int number = scanner.nextInt();
		System.out.print("Number of digits are: ");
		//System.out.println(String.valueOf(number).length());
		System.out.println(getlength(number));
		scanner.close();
		
	}
	
	static int getlength(int number) {
		int count = 0;
		while(number > 0) {
			count++;
			number = number / 10;
		}
		
		return count;
	}
}
