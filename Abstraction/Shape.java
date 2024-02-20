package Abstraction;

/* Points to remember.
 * 1. Abstract class must be declared with abstract keyword.
 * 2. it can have complete or incomplete method
 * 3. Abstract class have constructor/static method. 
 * 4. It can have final methods which will force the subclass not to change the body of the method.
 */

public abstract class Shape {   // Abstract class must be declared with abstract keyword
	
	Shape(){
		System.out.println("Abstract class have constructor/static method");
	}
	
	
	abstract void draw();
	
	void drawing() {
		System.out.println("drawing skill");
	}
	

}
