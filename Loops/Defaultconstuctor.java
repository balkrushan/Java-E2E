
public class Defaultconstuctor {
	
	String name;
    // Default  Constuctor: does not accept any argument 
	//Constuctor name should be same as Class name
	// initialize the global variable 
	//Constuctor does not return anything
	public Defaultconstuctor () {
		
		name="RDR";
		System.out.println("Project name: "+ name);
	}
	
	public static void main(String[] args) {
		Defaultconstuctor test=new Defaultconstuctor();
		String a=test.name;
		System.out.println("Project name: "+ a);
		
		
		///   Constructor calling from another class 
		
		Parameterizedconstuctor test2	=new Parameterizedconstuctor(10, "bala","pune");
		Parameterizedconstuctor test3	=new Parameterizedconstuctor(10, "bala","pune");
		    
	}
}
