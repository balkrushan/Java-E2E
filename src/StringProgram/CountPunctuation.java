package StringProgram;

public class CountPunctuation {
	
	static int count =0;
	
	public static void punctuation() {
		
		String  str = "He said, 'The mailman loves you.' I heard it with my own ears.";
		
		String str1=",'.";
		
		for(int i=0; i<str.length();i++) {
			for(int j=0; j<str1.length(); j++) {
				if(str.charAt(i)==str1.charAt(j)) {
					count++;
				}
			}
		}
		System.out.println(" CountPunctuation:" + count);
	}
	
	public static void main(String[] args) {
		punctuation();
	}

}
