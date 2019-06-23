package pattern;

public class SquarePattern1 {

	public static void pattern(int count)
	{
		for(int i=1; i<=count;i++)
		{
			for(int j=1;j<=count; j++)
			{
			if(i==1 || i==count || j==1 || j==count)
			{
				System.out.print(" * ");
			}
			else
			{
				System.out.print("   ");
			}
			}
			System.out.println();
		}
	}	
	public static void main(String[] args) { 
		pattern(5);
	}

}
