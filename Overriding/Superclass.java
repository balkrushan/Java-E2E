package Overriding;

public class Superclass {
	
	public static void m1() {
		
		System.out.println("This is a method of super class");
		
	}
	
   public  void m2() {
		
		System.out.println("This is a method of super class");
		
	}
   protected void m2(int a) {
	   System.out.println("Scope of superclass method is reduced");
   }
   
   
   void superclassMethod() {
	   
   }

}
