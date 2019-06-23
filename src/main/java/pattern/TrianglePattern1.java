package pattern;

public class TrianglePattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		trianglePattern(5);
	}

	
	private static void trianglePattern(int n) {
		// TODO Auto-generated method stub
		for(int i = 0; i<n; i++){
			for(int j = 1; j<=n-i; j++){
				System.out.print("  ");
			}
			for(int k=0; k<=i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
