package loops;


public class MultiplicationTableUsingMethods {

	static String multiplicationTable(int number) {
		String res = "";
		for (int index = 1; index < 10; index++) 
		{
			res += number + " * " + index + " = " + number * index + "\n";
		}
		return res;
	}
	
	static String rangeTables(int startValue, int endValue) {
		String res = "";
		for (int index = startValue; index <= endValue; index++) {
			res += multiplicationTable(index) + "\n";
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println(rangeTables(2, 6));
	}
}
