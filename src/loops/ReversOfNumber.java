package loops;

import java.util.Scanner;

public class ReversOfNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find the revers: ");
		int number = scanner.nextInt();
		System.out.print("revers of given number: ");
		System.out.println(getRevers(number));
		scanner.close();
		
	}
	
	static int getRevers(int number) {
		int rem = 0, sum = 0;
		while(number > 0) {
			
			rem = number % 10;
			sum = (sum * 10) + rem;
			number = number / 10;
		}
		
		return sum;
	}
}
