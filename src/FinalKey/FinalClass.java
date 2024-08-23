package FinalKey;

public class FinalClass {
	
	// 1. We cant change value of variable if variable declared as final 
	// 2. we can'nt override the final method or we can'nt change value of final method
	
	 static  int a=5;
	
	
	
	public static void m1()
	{
		a=10;
		System.out.println("value of A:" + a);
	}
	
	public void m2() {
		this.a=26;
		this.a=15;
		System.out.println("value of A:" + a);
	}
	
	
	public static void main(String[] args) {
		
		int b=FinalClass.a;
		System.out.println("value of A:" + b);
		m1();
		FinalClass obj=new FinalClass();
			obj.m2();
		
		
	}
}
