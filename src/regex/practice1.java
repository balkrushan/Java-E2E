package regex;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.logging.Logs;

public class practice1 {
	
	public static void main(String[] args) {
		
		Pattern pat=Pattern.compile("..a");
		Matcher match=pat.matcher("tya");
		
		boolean result=match.matches();
		
		//System.out.println(result);
		boolean result1=Pattern.compile(".b").matcher("aba").matches();
		System.out.println(result1);
		
          Pattern pattern=Pattern.compile("[abc]");
          Matcher match1=pattern.matcher("ab");
          System.out.println("Found match: "+match1.matches());
          while(match1.find()) {
        	  
        	  System.out.println("Found match: " + match1.group());
        	  
          }
          
	
	}

}
