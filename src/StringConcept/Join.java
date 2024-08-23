package StringConcept;

public class Join {

	public static void main(String[] args) {
		
		// join() method return a String joined with given delimiter , as per below declared string if i want array should be covert into string with delimter - 
		// then add "-" array will covert into string with - like Ready-API-Project
		
		//join is nothing but just join multiple strings into single string using delimiter
		
		String[] a= {"Ready", "API", "Project"};
		String b=String.join("-" ,a );
		System.out.println(b);
		
		String z=String.join("-","Ready","API","Project");
		System.out.println(z);
	}
	
	
	
}
