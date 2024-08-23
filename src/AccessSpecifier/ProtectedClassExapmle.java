package AccessSpecifier;



////////We can'nt create class as protected

protected class ProtectedClassExapmle {
	
	
	void display()  
	{  
	    System.out.println("Try to access outer protected class");  
	}  
	public static void main(String[] args) {  
		ProtectedClassExapmle p=new ProtectedClassExapmle();  
	    p.display();  
	      
	}  

}
