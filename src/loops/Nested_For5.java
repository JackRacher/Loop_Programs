package loops;

public class Nested_For5 
{
	public static void main(String[] args) 
	{
		String res = "";
		for (int row = 1; row <= 5; row++) 
		{
			for (int cols = 5; cols >= 1; cols--) 
			{
				res += row + " ";
			}
			res += "\n";
		}
		System.out.println(res);
	}

}
