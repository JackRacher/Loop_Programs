package loops;

public class Simple_For 
{
	public static void main(String[] args) 
	{
		String res = "";
		for (int row = 1; row <= 5; row++) 
		{
			for (int cols = 1; cols <= 5; cols++) 
			{
				res += cols + " ";
			}
			res += "\n";
		}
		System.out.println(res);
	}
}
