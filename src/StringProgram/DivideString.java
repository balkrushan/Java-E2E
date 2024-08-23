package StringProgram;

public class DivideString {
	
	public void dividIntoEqualsPart() {
		
		
		String str="abcdefghijkl";
		
		int len=str.length();
		
		int d=2;  
		
		int part=len/d;
		
		String a[]=new String[d];
		int temp=0;
		
		if(len % 2 !=0) {
			System.out.println("Could not divide string into equals part");
		}else {
			
			for(int i=0; i<len; i=i+part)
			{
				 a[temp]=str.substring(i, i+part);
				 temp++;
			}
			}
		for(String b:a) {
			System.out.println(b);
		}
	}
	

       public static void main(String[]args) {
    	   DivideString obj=new DivideString() ;
    	   obj.dividIntoEqualsPart();
    	   
       }

}

