package StringProgram;

public class changeCase {
	
	public void changeCaseOFString(String str) {
		
		StringBuffer buf=new StringBuffer(str);
		
		for(int i=0; i<str.length();i++) {
			
			if((boolean) Character.isUpperCase(buf.charAt(i))) {
				
				buf.setCharAt(i,Character.toLowerCase(buf.charAt(i)) );
			}else if(Character.isLowerCase(buf.charAt(i))) {
				buf.setCharAt(i, Character.toUpperCase(buf.charAt(i)));
				
			}
		}
		
		System.out.println(buf);
		
	}
	public static void main(String[] args) {
		
		changeCase Case=new changeCase();
		Case.changeCaseOFString("QA Automation");
		
		
	}

}
