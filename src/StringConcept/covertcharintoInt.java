package StringConcept;

public class covertcharintoInt {

	
	public static void main(String[] args) {
		
		String a="masd23m";
		
		int y=0;
		
		for(int i =0; i<=a.length()-1;i++) {
			
			if(Character.isDigit(a.charAt(i))) {
			 
			char b=a.charAt(i);
			String c=String.valueOf(b);
			Integer z=Integer.valueOf(b);
			    y+=z;
			}
			
		}
		System.out.println(y);
	}
}
