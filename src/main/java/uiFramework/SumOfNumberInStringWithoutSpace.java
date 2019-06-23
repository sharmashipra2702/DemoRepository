package uiFramework;

public class SumOfNumberInStringWithoutSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			String s = "Sachinmade200runin150ballsin40overandcentuaryin90ballsattheageof40";
			int sumOfNumber = sumOfNumber(s); 
	        System.out.println(sumOfNumber);
		
	}

	private static int sumOfNumber(String s) {
		// TODO Auto-generated method stub
		String temp = "";
		int sum = 0;
		for(int i=0; i<s.length()-1; i++){
			
		    if(Character.isDigit(s.charAt(i)))	{
		    	temp = temp+s.charAt(i);
		    	if(!Character.isDigit(s.charAt(i+1))){
		    		sum = sum+Integer.parseInt(temp);
		    		temp = "";
		    	}
		    }
		}
		return sum;
	}

}
