package Encapsulation;

import java.util.Scanner;





/* Notes 
 * 
 * 1. Always declare global variable as private and you can access that variable via public method
 * 2. getter method: to get the value
 * 3. Setter Method: to set the value
 * 4. By providing only a setter or getter method, you can make the class read-only or write-only.
 * 5. It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only, 
   you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.
   
 * 6. It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.
 * 
 * 
 * 7. limit its visibility to the containing class for better control and maintainability.
 */

public class Employee {
	
	private int salary;
	
	int setsalary(int salary) {
		 
		this.salary=salary;
		
		if(salary>0){
			
			System.out.println("salary is greater than 0:" + salary);
			
		}else {
			System.out.println("salary is greater than 0:" + salary);
		}
		return salary;
		
	}
	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("enter salary");
		int a=scan.nextInt();
		Employee emp=new Employee();
		emp.setsalary(a);
		
		
	}

}
