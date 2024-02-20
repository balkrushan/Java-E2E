package AccessSpecifier;

public  class Protectedkeyword {
	
	/* 1. access level of protected keyword is within the pkg.  (Scope within pkg)
	 * 2. if i want to access protected method/variable in other pkg then i can access through inheritance (Scope outside the pkg through inheritance)
	 * 3. we can't declare class as protected.
	 * 4. we can'nt create constructor as Protected
	 */

	public String color="red";
	
	 protected static String msg="Try to access the protected variable outside the package";  
	 
	 static String msg1="Try to access default keyword outside the pkg"; // default means variable is declared without any access modifier keyword. like public, private , protected.
	 
	protected void test() {
		 
		 System.out.println("This Test method is protected");
	 }
	 
	 public static void main(String[] args) {
		
	}

	
     
	}  

