package Overloading;

public class Superclass {
	
	/*  1. There are two ways to overload the method in java
	 *     By changing number of arguments
           By changing the data type
	 */
	
//	By changing number of arguments
	
	public void m1(int a) {
		
		System.out.println("output of 1st m1:" + a);
	}
	
	public void m1(int a, int b) {
		
		System.out.println("output of 2nd m1:" + (a+b));
		
	}
	
	void m1(double a,double b) {
		System.out.println(a+b);
		
	}
	
    void m1(String k,String b) {
    	System.out.println("this is the object method String 2");
		
	}
    void m1(Superclass object) {
    	System.out.println("this is the object method");
    }
	
// By changing the data type
	
	public void m1(String datatype) {
		 System.out.println("this is datatype");
		
	}
	
	public static void main(String[] args) {
		Superclass obj=new Superclass();
		obj.m1(10);
		obj.m1(20, 50);
		obj.m1(new String(),new String());
		obj.m1(new String());
		obj.m1(new Superclass());
		
		
	}

	

}
