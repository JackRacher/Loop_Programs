package loops;

import java.util.Scanner;

public class ReversOfNaturalNumbers {
	
	static String getRevers(int startValue, int endValue) {
		String res = "";
		for (int index = endValue; index >= startValue; index--) {
			res += index + ", ";
		}
		return res.substring(0, res.length()-1);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start value an end value to print the revers order of natural numbers: ");
		System.out.println(getRevers(scanner.nextInt(), scanner.nextInt()));
		scanner.close();
	}
}
