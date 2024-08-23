package Enum;


	
	public class StringToEnumExample {  
	    // Define the Day enum with associated abbreviations  
	    public enum Day {  
	        MONDAY("Mon","one",50), TUESDAY("Tue","two",50), WEDNESDAY("Wed","three",60), THURSDAY("Thu","four",90), FRIDAY("Fri","five",45), SATURDAY("Sat","Six",98), SUNDAY("Sun","seven",96);  
	        // Private field to store the abbreviation for each day  
	        private final String abbreviation;  
	        private final  String sequence;
	        private int value;
	        // Constructor to initialize the abbreviation for each enum constant  
	       Day(String abbreviation,String two,int a) {  
	            this.abbreviation = abbreviation; 
	            this.sequence=two;
	            this.value=a;
	        }  
	        // Getter method to retrieve the abbreviation for a specific day  
	        public String getAbbreviation() {  
	            return abbreviation;  
	        }  
	        // Custom method to convert an abbreviation string to the corresponding enum constant 
	        
	        
	        public static Day fromAbbreviation(String abbreviation) {  
	            for (Day day : Day.values()) {  
	                if (day.getAbbreviation().equalsIgnoreCase(abbreviation)) {  
	                    return day;  
	                }  
	            }  
	            // If no match is found, throw an IllegalArgumentException  
	            throw new IllegalArgumentException("Invalid abbreviation: " + abbreviation);  
	        }
	        
	        public  String getSequence() {
				return sequence;
	        	
	        }
	        
	        public int getValue() {
	        	return this.value;
	        }
	    } 
	    
  public enum calender {
	  
	  No_timeline("4");
	  
	  private String value;

	calender(String string) {
		 this.value=string;
	}
	 String  getvalue (){
		return this.value;
		  
	  }
	  
  }

      public static void main(String[] args) {  
	        String dayString = "Fri";  
	        // Convert the abbreviation string to the corresponding Day enum constant  
	        Day day = Day.fromAbbreviation(dayString);  
	        System.out.println(day); // Output: FRIDAY  
	       Day n= Day.MONDAY;
	       System.out.println(n);
	       Day days;
	       Day day1=Day.MONDAY;
	       String a= day1.getSequence();
	       System.out.println(a);
	       int value=day1.getValue();
	       System.out.println(value);
	       
	      
	       
	 
	  
	calender cal= calender.No_timeline;
	
	  System.out.println(cal.getvalue());
	  
	    }  
	}  


