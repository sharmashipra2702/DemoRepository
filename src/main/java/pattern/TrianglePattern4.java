package pattern;

public class TrianglePattern4 {
	public static void patternPrint(int count)
	{
		for(int i=1; i<=count; i++)
		{	//System.out.println("Name");
			for(int j=count-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print(" " +k);
			}
			for(int l=count-1; l>=i; l--)
			{
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			patternPrint(10);
		}
	}
}
