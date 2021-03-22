package loops;

public class Simple_While_Program 
{
	public static void main(String[] args) 
	{
		int number = 1;
		String res = "";
		while(number <= 5)
		{
			res += "Welcome\n";
			number++;
		}
		System.out.println(res);
	}
}
