package numberProgram;

public class rightTringlePattern {
	
	public static void main(String[] args) {
		
		int i,   rows=7;
		int j;
		
		for(i=0; i<rows; i++)
		{
			for(j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
