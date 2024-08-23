
public class Parameterizedconstuctor {

	
	 int id;
	 String name;
	 String city;
	 
	 // 1. parameterized constructor we can pass the parameter in its argument 
	 // 2.0 We can call/invoke constructor without creation of object. (that means whenever we called the class then constructor will call automatically)
	 // 2.1 example: Parameterized constuctor test= new Parameterizedconstuctor(10,"balkrushan","dharashiv"); no need to create object like (test .)
	 // 3.Constructor initialize the declaired global variable
	 // 4. Constructor name is same as Class name
	 // 5. if we dont write any constructor in the class then default constructor will be added by JVM.
	 // 6. when you Write any constructor in the class then default constructor will not be added by JVM.
	 // 7. We can use multiple constructor in the same class.
	 // 8. We can overloaded Constructor 
	//  9.Constructor does not return anything
	 
	 
	 public Parameterizedconstuctor(int id , String username, String usercity) {  ///Constructor 1
		 this.id=id;
		  name=username;
		  city=usercity;
		  
		  System.out.println("userid is:" + id);
		  System.out.println("username:"+  name);
		  System.out.println("usercity is: " +city);
		  
	 }
	 
	 public Parameterizedconstuctor(int userid , String username) {
		 this.id=userid;
		  name=username;
		  
		  
		  System.out.println("userid is:" + id);
		  System.out.println("userid is:" +name );
	 }
	 
	 
	 
	 public static void main(String[] args) {
		 
		 Parameterizedconstuctor test= new Parameterizedconstuctor(10,"balkrushan","dharashiv");  ///Calling constructor .
		String x=test.name;
		
		System.out.println("Username is :" + x);
		
		Parameterizedconstuctor test1= new Parameterizedconstuctor(20,"krushan","dharashiv"); /// single Constructor1 is Overloaded with different parameter
		
		Parameterizedconstuctor test2= new Parameterizedconstuctor(30,"Siraskar");
		
		Chiled ch=new Chiled(110,"Bhimrao","Sangli");
		
		
		
		
		
		
		
		
		
		
		/////////////Main perpose of Constuctor//////////////////////////////
		
	/*	it is used to initialize the global variable
		very imp point: it is used to execute some code at object creation by calling .....
		
		jenvha tumhi class la call karal kuthehi other class mdhe like constructor obj=new contructor() ass,  tenvha tya class cha constuctutor call hoil aani 
		constuctor madhe je initialize kel aahe to code default execute hoil every time.
		
	    Test a =new Test(); 
	    super();
	    this();
	    
	    
		
		  */
		
	}
}
class Chiled extends Parameterizedconstuctor
{

	public Chiled(int userid, String username, String usercity) {
		super(userid, username, usercity);
		// TODO Auto-generated constructor stub
		
	}

	public void abc(String city)
	{
		
		super.city=city;
	
		
		
		// TODO Auto-generated constructor stub
	}
	
}