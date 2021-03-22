package loops;

public class ReversFactorial {

	static String reversFactorial(int number) {
		String res = "";
		int product = 1;
		for (int index = number; index >= 1; index--) {
			res += index +"*";
			product *= index; 
		}
		return res.substring(0, res.length()-1) + " = " + product;
	}
	
	public static void main(String[] args) {
		System.out.println(reversFactorial(5));
	}
}
