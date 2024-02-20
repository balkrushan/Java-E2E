package Superkey;

public class Practice1 {
	
	Parentclass_superkey key;
	
	Practice1 (){
		
		key=new Parentclass_superkey();
	}
	
	public void method() {
		
		String a=key.m3();
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Practice1 ob=new Practice1 ();
		ob.method();
	}
	
	


}
