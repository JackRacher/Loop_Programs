package loops;

public class Simple_For3 
{
	public static void main(String[] args) 
	{
		String res = "";
		for (int row = 1; row <= 5; row++) 
		{
			for (int cols = 1; cols <= row; cols++) 
			{
				res += row + " ";
			}
			res += "\n";
		}
		System.out.println(res);
	}

}
