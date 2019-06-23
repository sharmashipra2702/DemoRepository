package pattern;

public class PyramidPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pyramidPatternNumber(6);
	}

	private static void pyramidPatternNumber(int n) {
		// TODO Auto-generated method stub
		for(int i=1; i<=n; i++){
			for(int j=0; j<n-i; j++){
				System.out.print("  ");
			}
			for(int k=i; k>=1; k--){
				System.out.print(k+" ");
			}
			if(i>1){
				for(int l=1; l<i; l++){
					System.out.print((l+1)+" ");
				}		
			}
			System.out.println();
		}
		
	}

}
