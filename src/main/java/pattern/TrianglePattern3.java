package pattern;

public class TrianglePattern3 {

	public static void pattern(int count)
	{
		for(int i=1; i<=count; i++)
		{
			for(int j=count-1; j>=i; j--)
			{
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			pattern(10);
	}
}
