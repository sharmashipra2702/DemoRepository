package operatorsExamples;

public class Operators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "vishal";
		String s2 = "vishal";
		System.out.println("s1 == s2 is :"+ s1 == s2);
		
	/*	in java + operator precedence is more than == operator. so this expression will be evaluated
		as "s1 == s2 is :vishal" == "vishal"
		so the answer will be false.
	*/
	}

}
