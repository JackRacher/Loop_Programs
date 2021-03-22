package loops;

public class StudentMarksUsingMethods {

	static boolean ispass(int[] marks) {
		boolean b = false;
		int count = 0;
		for (int i = 0; i < marks.length; i++) {
			count++;
		}
		if(count == marks.length)
			b = true;
		return b;
	}
	
	static int calTotal(int[] marks) {
		int sum = 0;
		for (int i : marks) {
			sum += i;
		}
		return sum;
	}
	
	static String findGrade(int[] marks) {
		String res = "";
		if(ispass(marks)) {
			res += "Passed\n";
			res += "Total Marks = " + calTotal(marks);
			int avg = calTotal(marks) / marks.length;
			res += "Average marks = "  + avg;
			if(avg >= 75) {
				res += "Distintion\n";
			}
			else if(avg >= 60) {
				res += "firstclass\n";
			}
			else if(avg > 50) {
				res += "Second Class\n";
			}
			else {
				res += "third class\n";
			}
		}
		else {
			res += "Faild";
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] marks;
		marks = new int[5];
		System.out.println(findGrade(marks));
	}

}
