package loops;

public class Simple_Do_While_Program 
{
	public static void main(String[] args) 
	{
		int number = 1;
		String res = "";
		do
		{
			res += "Welcome\n";
			number++;
		}while(number <= 5);
		System.out.println(res);
		
	}

}
