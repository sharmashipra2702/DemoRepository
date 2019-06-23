package pattern;

public class PyramidPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pyramidPatternNumber(20);
	
	}

	private static void pyramidPatternNumber(int n) {
		// TODO Auto-generated method stub
		for(int i=1; i<=n; i++){
			for(int j=0; j<n-i; j++){
				System.out.print("  ");
			}
			for(int k=1; k<=i; k++){
				System.out.print(k+"   ");
			}
			System.out.println();
		}
	}

}
