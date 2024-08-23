
public class Ifelse_ControlStatement {
	
	
	
	/*   Control statement in java
	 * def: it control the flow of program called as control statement.
	 * Types of Control Statement
	 * 1. If Statement
	 * 2. if else statement
	 * 3. if else if ladder statement
	 * 4. nested if statement 
	 * 5. Switch statement 
	 * 6. Continue Statement
	 * 
	 * 
	 * Java provides three types of control flow statements.

1] Decision Making statements
if statements
switch statement
2] Loop statements
do while loop
while loop
for loop
for-each loop
3] Jump statements
break statement
continue statement

	 
	 */
	
	
	public static void ifelse_ladder_practice_1() {    //if else if ladder statement 1
		
		int marks=10;
		
		if (marks>=45 && marks<60) {
			System.out.println("D grade");
		}else if(marks>=60 && marks<70) {
			System.out.println("c grade");
		}else if(marks >=90 && marks<=100) {
			System.out.println("A grade");
		}else{
			System.out.println("incorrect output");
		}
	}
	
	public static void ifelse_ladder_practice_2() {  //if else if ladder statement 2
		
		String [] a = {"4","0","2","1256"};
	      int b=4;
	      int zero=0;
	      
	      for(int i=0; i<a.length; i++) {	
	      	    int version=Integer.parseInt(a[i]);
	      	    if ((version > b) ) {
	      	    	System.out.println("BPI ++");
	      	    }else if(version==b) {
	      	    	int version2=Integer.parseInt(a[i+1]);
	      	    	if(version2>zero) {
	      	    		System.out.println("Version is greater than threshold");
	      	    	}else if (version2==zero) {
	      	    		System.out.println("Version is equal to zero");
	      	    	}
	      	    }else {
	      	    	System.out.println("Version is less than threshold");
	      	    }
	      	    break;
	      }
		
	}
	
	public static void nestedIf_controlStatement() {         // Nested if loop
		
		// inner if block condition will executed when outer if block is true.
		
		int i= 10;
		
		if (i>=50) {                                                             //outer if block
			System.out.println("i is greater than equal to 50");
			    if (i<=50) {                                                     //inner if block
			    	System.out.println("i is less than equal to 50");
			    }
		}else {
			System.out.println("i is not greater than equal to 50");
		}
		
	}
	
	
	public static void switchStatement() {                           ////////////switchStatement
		
		int number =10;
		
		switch( number) {
		
		case 10:
			
		System.out.println("This is a 1st number");
		
		break;
		
		case 2:
			
			System.out.println("This is a 2nd number");
			break;
			
		case 3:
			System.out.println("This is 3rd number");
			break;
			
			default:
				System.out.println("Invalid input");
				break;
		}
		
		
			
		
	}
	
	public static void Continuestatement() {                       ///////////////// Continuestatement
		  
		    //for loop  
		    for(int i=1;i<=10;i++){  
		        if(i==5){  
		            //using continue statement  
		            continue;//it will skip the rest statement  
		        }  
		        System.out.println(i);  
		    }  
		} 
	
	public static void Continue_Statement_with_Inner_Loop() {   /////// Continue_Statement_with_Inner_Loop
		  
	    //for loop  
	    for(int i=1;i<=5;i++){  
	         for (int j=1; j<=5; j++)  {
	        	  if(i==2 && j==4) {
	        		  continue;
	        	  }
	        	  System.out.println(i+" "+j);
	         }
	                    
	    }  
	}
	
	public static void constinuestatement_pracice3() {
		aa:  
            for(int i=1;i<=3;i++){    
                    bb:  
                    for(int j=1;j<=3;j++){    
                        if(i==2&&j==2){    
                            //using continue statement with label  
                            continue aa;    
                        }    
                        System.out.println(i+" "+j);    
                    }    
            }    
} 
	
	public static void contineousStatement_DoWhileLoop() {
		
		int i=1;
		
		do {
			
			if(i==5) {
				continue;
			}
			System.out.println("i=:" + i);
			i++;
			
		} while(i<=5);
		
	
	
	}	 
	
	public static void main(String[] args) {
		
//		ifelse_ladder_practice_1();
//		ifelse_ladder_practice_2(); 
//		nestedIf_controlStatement();
        switchStatement();
//        Continuestatement();
//        Continue_Statement_with_Inner_Loop();
//        constinuestatement_pracice3();
//        contineousStatement_DoWhileLoop();
		
      
  
	}

}
