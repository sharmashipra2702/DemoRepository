package uiFramework;

public class CountOfADigitInNumbersRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int occurrenceOfDigitCount = occurrenceOfDigit(3, 30);
		System.out.println(occurrenceOfDigitCount);

	}

	private static int occurrenceOfDigit(int occurringNumber, int tillNumber) {
        int countOfOccurringDigit = 0;
		String str = "";
		for(int i=0; i<=tillNumber; i++){
		  str+=Integer.toString(i);
		}
		
		for(int i=0; i<str.length(); i++){
			if(Character.getNumericValue(str.charAt(i)) == occurringNumber){
				countOfOccurringDigit++;
			}
		}
		
		return countOfOccurringDigit;

	}

}
