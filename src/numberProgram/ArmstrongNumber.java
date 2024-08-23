package numberProgram;

public class ArmstrongNumber {
	
	// armstrong number= 153=1^3+5^3+3^3=153
	
	  public static boolean isArmstrong(int num) {
		  
		  int temp=num;
		  
		 int  total=0;
		  
		  int power=Integer.toString(temp).length();
		  
		  while(temp>0) {
			  
			  int div=temp%10;
			  total +=Math.pow(div, power);
			  temp=temp/10;
		  }
		  
		  boolean a = false;
		  if (num==total) {
			  a=true;
		  }
		  return a;
		  
	  }
    public static void main(String[] args) {
        int number = 153;
        
        if(isArmstrong(number))
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
    
  
}
