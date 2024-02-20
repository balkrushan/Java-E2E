package StringConcept;

public class Example3 {
public static void main(String[] args) {
		
		String a1="OBRDR";                
		// object will create in constant pool area  Object=a1 address=101 value=OBRDR
		String a2=new String("OBRDR");    
		/*  object will create in heap area =  Object=a2  address=102   value=OBRDR
		 *  then will check whether same value is present in pool area if yes then object will not create in pool area.
		 *  
		 *  pool area= Object=a1 address=101 value=OBRDR
		 *  heap area =  Object=a2  address=102   value=OBRDR
		 *  
		 *  a1==a2  false even if values are same.
		 *  
		 *  
		 *  
		 * 
		 * 
		 */
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		
	}

}
