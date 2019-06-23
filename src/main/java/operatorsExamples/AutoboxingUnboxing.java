package operatorsExamples;

public class AutoboxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(10);
		int i1 = i;
		System.out.println(i1);
		
		String s="vishal";
		s.length();
		int a[] = {1,2};
		String sentence[] = {"vishal", "mishra"};
	}
   
public float verify(float a, int b)
{	
	return a+b;
}
public float verify(int a, float d)
{
	return a+d;		
}
}
