package StringProgram;

public class replaceSpaces {
	
	public static void replaceStr(String str)
	
	{
		
		//String a=str.replace(" ", "_");   //Replace String 
		String a=str.replaceAll("\\s","	"); // Replace white spaces
		
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		
		replaceStr("Once in a blue moon");
	}
}
