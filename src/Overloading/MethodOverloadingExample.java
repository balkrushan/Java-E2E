package Overloading;

  /* In java, method overloading is not possible by changing the return type of the method only because of ambiguity. 
   * Let's see how ambiguity may occur:
   * 
   * 
   */
	
	public class MethodOverloadingExample {

	    // Attempt to overload methods with different return types
	    public int add(int a, int b) {
	        return a + b;
	    }

	    public double add(int a, int b) {
	        return (double)(a + b);
	    }

	    public static void main(String[] args) {
	        MethodOverloadingExample example = new MethodOverloadingExample();
	        
	       System.out.println(example.add(5, 10));
	       
	       
	    }
	}


