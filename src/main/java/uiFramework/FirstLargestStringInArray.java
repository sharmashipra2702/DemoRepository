package uiFramework;

public class FirstLargestStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I love my india";
		String largestString = firstLargestString(str);
		System.out.println("Largest String is: "+largestString);
	}

	private static String firstLargestString(String str) {
		// TODO Auto-generated method stub
	 
		String s[] = str.split(" ");
		int index = 0;
		int largestStringLength = s[0].length();
		for(int i=0; i<s.length; i++){
			if(s[i].length()>largestStringLength){
				largestStringLength = s[i].length();
				index = i;
			}
		}
		return s[index];
	}

}
