package pattern;

public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		trianglePattern(5);
	
	}

	private static void trianglePattern(int n) {
		// TODO Auto-generated method stub
		for(int i = 0; i<n; i++){
			for(int j = 1; j<=i+1; j++){
				System.out.print(j+" " );
			}
			System.out.println();
		}
	}
}
