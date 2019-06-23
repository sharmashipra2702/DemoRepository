package uiFramework;

public class SecondLargestStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I LOVE MY INDIA";
		String largestString = secondLargestString(str);
		System.out.println("Largest String is: "+largestString);
	}

	private static String secondLargestString(String str) {
		// TODO Auto-generated method stub
	 
		String s[] = str.split(" ");
		int index = 0;
		int largestStringLength = s[0].length();
		int secondLargestStringLength = s[0].length();
		for(int i=0; i<s.length; i++){
			if(s[i].length()>largestStringLength || s[i].length()>secondLargestStringLength){
				largestStringLength = s[i].length();
				secondLargestStringLength = largestStringLength;
				index = i;
			}
		}
		return s[index];
	}

}
