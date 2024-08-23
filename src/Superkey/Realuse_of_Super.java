package Superkey;

public class Realuse_of_Super {
	
	int a;
	String b;
	
	Realuse_of_Super(int id, String name){
		this.a=id;
		this.b=name;
		
	}
	
	 void method() {
		 
		 System.out.println("real use of contructor");
	 }
	 
	 public static void main(String[] args) {
		
	//	 Realuse_of_Super a=new Realuse_of_Super(50,"balkrushan"); 
		 
		 Employee ob=new Employee(50, "balkrushan");
		 ob.abc(); 
	}

}

  class Employee extends Realuse_of_Super{
	
	Employee(int id,String name){
		
		super(id, name);
		System.out.println(id);
		System.out.println(name);
	}
	
	void abc () {
		System.out.println("calling this method in other class with has-A relationship and cosntructor calling in other class constructor");
	}
	
	
	
}
