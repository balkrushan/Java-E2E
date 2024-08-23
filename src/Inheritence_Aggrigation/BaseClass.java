package Inheritence_Aggrigation;

public class BaseClass {
	
	//1. Inheritance: other name of inheritance : IS-A relationship
	//2. Defn: Inheritance is the acquiring info of the other class through extends keyword.
	//3. Advantage: Code reusability
	
	/* 4. All member of base class will be inherited into subclass
	 *  there are two conditions
	 *   1. to check access specifier.
	 *   2. member or variable that does not exist into sub class
	 * 
	 */
	
	/* when to use inheritance.
	 *  if i want to increase the feature of the class..
	 *  feature means: to increase variable or method.
	 */
 
	
	int a=10;
	int b=20;
	
	public void m0() 
	
	{
		System.out.println("M0 method of base class");
	}
	
	public void m1() {
		System.out.println("M1 method of base class");
	}
	
	public void m2() {
		
		System.out.println("M2 method of base class");
	}
			
}
