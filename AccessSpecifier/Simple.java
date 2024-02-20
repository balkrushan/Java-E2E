package AccessSpecifier;

public class Simple {
	
	/*1. if we are accessing private variable from class A to Class B then we will get compile time error.
	 * 2. If you make any class constructor private, you cannot create the instance of that class from outside the class. 
	 * 3. A class cannot be private or protected except nested class.
	 */
	
	
	
	public static void main(String[] args) {
		
	//	1. if we are accessing private variable from class A to Class B then we will get compile time error.
		
		PrivatekeywordA a=new PrivatekeywordA();
		a.data;              ////Compile Time Error  
		a.msg();             ////Compile Time Error 	
		
		
	//2. If you make any class constructor private, you cannot create the instance of that class from outside the class.
		PrivateContructor a1=new PrivateContructor(0);   //Compile Time Error
		
		
	//	A class cannot be private or protected except nested class.
		Privatenestedclass Outerclass=new Privatenestedclass();
		Outerclass.PrivateInnerClass innerclass=new PrivateInnerClass();   //Compile Time Error
		
	}

}
