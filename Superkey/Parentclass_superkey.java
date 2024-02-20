package Superkey;

public class Parentclass_superkey {
	
	
	
	Parentclass_superkey(){
		
		System.out.println("calling superclass constuctor");
	}
	
	
	String color="red";
	
	public String a="yellow";
	
	public void setOfColor() {
		
		System.out.println(this.a); 
	}
	
	public void m2() {
		 
		System.out.println(" m2 method of current class is calling in other class via super keyword");
	}
	
	public static String m3() {
		
		String ob="methodreturn";
		return ob;
	}
	
	
}
