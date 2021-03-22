package loops;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		
		String res = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find the armstrong: ");
		int number = scanner.nextInt();
		//System.out.println(getRevers(number));
		if(number == getRevers(number)) {
			res += "Armstrong";
		}
		else {
			res += "Not armstrong";
		}
		System.out.println(res);
		scanner.close();
		
	}
	
	static int getRevers(int number) {
		int rem = 0, sum = 0;
		while(number > 0) {
			
			rem = number % 10;
			sum = sum + (rem * rem * rem);
			number = number / 10;
		}
		
		return sum;
	}
}
