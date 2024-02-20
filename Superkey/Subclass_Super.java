package Superkey;

//1.   Super keyword--> invoke instance variable of immediate parent class
//2.   Super keyword--> invoke method of immediate parent class
//3.   Super keyword--> invoke constructor of immediate parent class
//4.   We can'nt use  super.m1(); in main method because main method is static.
//5.   we can't use   super.m1(); super.color; directly in class . super key will use in constructor and method only
//6.   super() is added in each class constructor by default at first statement/ preference.

/*7.   Real use of super class: jr class A chya constructor la class B chya constructor mdhe use karaych asel tr aadhi class A la extends kara then super key word cha use kara in Class B chya constuctor mdhe at first statement .
 *     like super(); jr Class A cha constructor ha parameterized asel tr super();mdhe pn parameter add kara. 
 */

/*8.  Class A madhe ek method aahe m1(); aani class B madhe pn same method write keli aahe m1();  jr mla Class b mdhe Class A chi method execute karaychi asel tr aadhi Class A la extend karav lagel 
 *    tyanntr method or contructor madhe super key use karun class A chya m1(); la execute karav lagel.
 * 
 */

/*9.  Class A mdhe ek constructor aahe aani Class B madhe ek contructor aahe, Class B ne Class A la inherits kele aahe. then class b la jenva main 
 *    method madhe execute karel like ClassB obj=new ClassB() tenvha Class A & Class B cha donhi constructor call hotil.yacha meaning Class B chya Constructor 
 *    mdhe automatically(implicitly) super(); key added asto by java.tyamulech Class A cha Constructor call zalela aahe ithe.
 * 
 * 
 */

/* parent class constructor will call automatically in subclass, without use  of super key word in subclASS constructor, 
 * 
 */

public class Subclass_Super extends Parentclass_superkey {
	
	//super keyword can also be used to invoke the parent class constructor.
	
	Subclass_Super(){
		
		super(); // Constructor call must be first statement. 
		
		System.out.println("Calling subclass constructor");
	
	}
	
	
	
	
	public void m1() {
		
		
	//	1st way  property of parent class acquired by subclass
		
		Subclass_Super obj1=new Subclass_Super();
		System.out.println(obj1.color);
	// 2nd Way	 directly using superclass
		Parentclass_superkey obj3=new Parentclass_superkey();
		  System.out.println(obj3.color);
		
   /* 3rd way
   * super is used to access the instance variable of immediate parent class ( immediate parent class means inheritance(extends))
   * 
   */
		String clr=super.color;
		System.out.println(clr);
		super.setOfColor();
		super.m2();
	}
	
	/*The super keyword can also be used to invoke parent class method. It should be used if subclass contains the same method as parent class. In other words, it is used if method is overridden.
	 * 
	 * we have two classes subclass and parent class both class have m2() method if we call m2() method from subclass then call m2() from subclass by default because priority is given to local.
	 * 
	 */
	
	public void m2() {
		
		super.m2();
		
		System.out.println("here m2 is the method which is already available in superclass."); // superclass madhil same method we can create in subclass.
	}
	

	// Note: super() is added in each class constructor automatically by compiler if there is no super() or this().
	
	public static void main(String[] args) {
		
		Subclass_Super obj=new Subclass_Super();
		obj.m1();
		obj.m2();
		
	}

}
