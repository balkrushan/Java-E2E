package Inheritence_Aggrigation;

public class Testclass {
	
	public static void main(String[] args) {
		
		
		//1. Inheritance: other name of inheritance : IS-A relationship
		//2. Defn: Inheritance is the acquiring info of the other class through extends keyword.
		//3. Advantage: Code reusability
		
		/* 4. All member of base class will be inherited into subclass
		 *  there are two conditions
		 *   1. to check access specifier.
		 *   2. member or variable that does not exist into sub class
		 * 
		 */
		
		/* dynamic dispatch concept:
		 * //parent class == //child class reference
		 *   BaseClass dynamicDispatch = new Childclass();
		 *   
		 *   ya concept madhe variable he base class che call hotat pn method hya child class chya call hotat.(if same method asel tr donhikde)
		 * 
		 */
		
		/* when to use inheritance.
		 *  if i want to increase the feature of the class..
		 *  feature means: to increase variable or method.
		 */
		
		
		
		
		
		// scenario 1
		
		Childclass child =new Childclass();
		
		System.out.println(child.a); //10 
		System.out.println(child.b); //30
		System.out.println(child.c);  //40
		child.m1();
		child.m2();
		
		
		
		
		//Scenario 2
		 BaseClass base=new BaseClass();
		 
		 System.out.println(base.a); //10
		 System.out.println(base.b); //20
		 
		 base.m1();   //base class method
		 base.m2();   //calling base class method
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 // Scenario 3  dynamic dispatch
		 // def: assigning child class reference to parent class 
		 
		 
		 //parent class == //child class reference
		 BaseClass dynamicDispatch = new Childclass();
		 
		  System.out.println(dynamicDispatch.a);  //-->From Base class
		  System.out.println(dynamicDispatch.b);  //--> Base class
		  
		  dynamicDispatch.m0();   //M0 method -->Base class
		  dynamicDispatch.m1();   //M1 method -->child class
		  dynamicDispatch.m2();   //M2 method -->child class
		  
		    
		
		 
		 //Scenario 4
		  
		  
		  BaseClass x =new BaseClass();
		  Childclass y=new Childclass();
		  
          x=y;
          
        System.out.println(x.a);
        System.out.println(x.b);
        
        x.m1();
        x.m0();
        
        
        //Scenario 5   type casting   2nd and 3rd scenario is same.
        //down-casting
        
        BaseClass x1 =new Childclass();
		 Childclass y1=new Childclass();
		 y1=(Childclass)x1;
		 
		 System.out.println(y1.b);
		 System.out.println(y1.a);
		 y1.m1();
		 
		 //Up-casting
		  
		BaseClass xy=(BaseClass)new Childclass();  
		          xy.m1();    //method of child class  m1 is common in both 
		 
			 
		 
		
		
	}
	
	
	

}
