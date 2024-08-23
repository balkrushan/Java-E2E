package StringBuffer_Builder;

public class mutableString {
	
	
	// String buffer is thread safe 
	// performance is good than builder
	
	
	// String buffer means mutable string or we can do modification in the string 
	public static void main(String[] args) {
		
		StringBuffer muteable=new StringBuffer("automation");
		muteable.setCharAt(2, 'B');
		System.out.println(muteable);/// output: auBomation
		
	//	System.out.println(muteable.reverse());
		
		System.out.println(muteable.append("practice"));
		System.out.println(muteable.replace(0,5,"bala-"));
		
		
		
		
	}
	
// Main defference between string buffer and builder is string buffer is thread safe or synchronized and string builder is not thread safe an synchronoized.
	
//	but both mutable or modificable 
}
