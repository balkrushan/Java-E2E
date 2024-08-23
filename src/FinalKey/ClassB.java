package FinalKey;

public class ClassB extends ClassA {
	
	/* 1.  m1(); is giving error because this method is declared as final in ClassA. That means user can'nt override the final method or we can'nt change value of final method
	 * 
	 *  i have created m1(); method in ClassA and declare as final. then same method i have created in ClassB then i have inherit or extends ClassA into ClassB
	 *  java giving compile time error because method is declare as final.
	*/
	
	
	// 3. We cant change value of variable if variable declared as final 
	
	// 4. we can'nt override the final method or we can'nt change value of final method
	
	// 5. we can declare Class as Final but we can not inherit or extend
	
	/*  6. Is final method inherited?
           Yes, final method is inherited but you cannot override it
	 * 
	 */
	
	/*  7. Can we initialize blank final variable?
           Yes, but only in constructor. 
	 */
	
	
	/* 8.  A static final variable that is not initialized at the time of declaration is known as static blank final variable.
	 *     It can be initialized only in static block.
	 * 
	 */
	
	
	
	
	// 3. We cant change value of variable if variable declared as final 
	
	public final static int constant;
	 static final int staticFinal;
	
	 final int a=10;
	 
	 final int panNo;
	 
	 //// 7.   Can we initialize blank final variable?
	 
	 ClassB(){               // Constructor
		 this.panNo=25693;   // we can initialized final variable only in constructor
	 }
	 
	 public void p1() {
		 
		 this.panNo=12563;  // we can'nt  initialized final variable except constructor
		 
		 a=20;             //
	 }
	
	// 4. we can'nt override the final method or we can'nt change value of final method
	
	public void m1() {
		
		System.out.println("this is the method of classB");
	}
	
	
	/* 8.  A static final variable that is not initialized at the time of declaration is known as static blank final variable.
	 *     It can be initialized only in static block.
	 *     
	 */
	
	static {
		
		staticFinal=100;
		constant=258;
		
	}
	

}
///////////////// 5. we can declare class as final but we can'nt inherits or extends
   final class ClassD{
	   
	   public static void m1() {
		   System.out.println("this is a final Class");
	   }
  }
   
   class ClassG extends ClassD{   /// giving compile-time error 
	   
   }
   
   
   
   
   
   
   ////////////////////////////////////////////////////////
   
   
   /*  6. Is final method inherited?
   Yes, final method is inherited but you cannot override it
* 
*/
   class Bike{  
	   
	   final void run(){
		   
		   System.out.println(" method is final");
		   
		   }  
	 }  
	 class Honda2 extends Bike{  
		 
	    public static void main(String args[])
	    {  
	    	
	     new Honda2().run();  
	    }  
	 }  
