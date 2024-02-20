package Overriding;

public class Subclass extends Superclass {
	
	/* 1. we can'nt override the static method. 
	 *     
	 *     Static methods can be redefined in a subclass with the same name, but this is method hiding, not overriding.
	 *     
	 * 2.    The method must have the same name as in the parent class
       3.    The method must have the same parameter as in the parent class.
       4.    There must be an IS-A relationship (inheritance).
       5.    overriding is the best example of runtime polymorphisam.
       6.    Cannot reduce the visibility of the inherited method from Superclass. means subclass madhil method cha scope ha superclass method peksha motha asava
              superclass method protected asel tr subclass madhil method hi public pahije.
       
	 */
	
	// this is called as method hiding
	
	public static void m1() {
		
		System.out.println("This is a method of subclass");  // called as compile time
	}
	
	//this is called as method overriding
	
    public  void m2() {
		
		System.out.println("This is a method of subclass");  // called as run time
		
	}
    
    
    void m2(int a) {                                          //Cannot reduce the visibility of the inherited method from Superclass.
    	
    }
    
    public void subclassMethod() {
    	
    }
	
	public static void main(String[] args) 
	
	 {
		
		Subclass x=new Subclass();
		x.subclassMethod();
	
		Superclass y=new Subclass();
		y.superclassMethod();
		
		m1();
		Subclass a=new Subclass();
		a.m2();

     }

}
