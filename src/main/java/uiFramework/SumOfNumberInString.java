package uiFramework;

public class SumOfNumberInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Sachin made 200 run in 150 balls in 40 over and centuary in 90 balls at the age of 40";
		int sumOfNumber = sumOfNumber(s); 
        System.out.println(sumOfNumber);
        int sumOfDigits = sumOfDigits(s); 
        System.out.println(sumOfDigits);
	}

	private static int sumOfDigits(String s) {
		// TODO Auto-generated method stub
		int sumOfDigits = 0;
		for(int i=0; i<s.length(); i++){
			if(Character.isDigit(s.charAt(i))){
				Character c = s.charAt(i);
				sumOfDigits = sumOfDigits+(Integer.parseInt(c.toString()));
//				sumOfDigits = sumOfDigits+(Character.getNumericValue(s.charAt(i)));
			}
		}
		
		return sumOfDigits;
	}

	private static int sumOfNumber(String s) {
		// TODO Auto-generated method stub
	String str [] = s.split(" ");
	int sumOfNum = 0;
	for(String s1 : str){
	  try{
		  int num = Integer.parseInt(s1);
		  sumOfNum = sumOfNum+num;
	  }
	  catch(Exception e){
	  }
	}
	return sumOfNum;
	}
}
