package StringProgram;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Encode {
  
	

	
	    public static String decodePwd(String encodedPassword) {
	        byte[] decodedBytes = Base64.getDecoder().decode(encodedPassword);
	        return new String(decodedBytes);
	    }
	    
	    public static void  encodePwd(String RDR_Pasword, String RDR_Username)
	    {
	    	String originalPass =RDR_Pasword;
	    	String originalUsername =RDR_Username;
	    	

	       
	        String encodedPass = Base64.getEncoder().encodeToString(originalPass.getBytes(StandardCharsets.UTF_8));
	        String encodedUsername = Base64.getEncoder().encodeToString(originalUsername.getBytes(StandardCharsets.UTF_8));
	        
	        System.out.println("Encoded Username: " + encodedUsername);
	       
	        System.out.println("Encoded Pass: " + encodedPass);
			
	    
	    }
	    public static void main(String[] args) {
	        
	        String encodedPassword = "UmFzQHNpdGVhZG1pbg=="; // 
	        String decodedPassword = decodePwd(encodedPassword);
	        System.out.println("Decoded Password: "+decodedPassword);
	        Encode.encodePwd("Admin@2023","Ras@siteadmin");
	    }
	
}
