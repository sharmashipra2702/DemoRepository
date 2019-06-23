package uiFramework;

public class PrimeNumber {

	public static void main(String[] args) {
	  Utility.primeNumber(19);
	}

}

class Utility{
	public static void primeNumber(int n){
		boolean flag = true;
		for(int i=2; i<n;i++){
			  if(n%i==0){
				  flag = false;
				  break;
			  }
		  }
		if(flag){
			System.out.println("number is prime");
		}
		else{
			System.out.println("Number is not prime");
		}
	}	
}
