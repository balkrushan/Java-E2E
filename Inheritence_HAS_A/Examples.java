package Inheritence_HAS_A;

import java.security.DomainCombiner;
import java.util.Scanner;

public class Examples {
	
	public static void getEmpDetails() {
		
		
		/* address class madhe varibales declare kele  and getter setter method
		 * emp class mdhe pn varibales declare kele  and getter setter method
		 *  emp class mdhe address class la as a referece class mhnun use kela 
		 *  emp class madhe set and get method design kelya for addreess class sathi 
		 * 
		 * 
		 * 
		 */
		
		
		Scanner scanner=new Scanner(System.in);
		
		//employee
		System.out.println("Enter emp id>>");
		int id=scanner.nextInt();
		System.out.println("Enter emp name>>");
		String name=scanner.next();
		System.out.println("Enter emp salary>>");
		int salary=scanner.nextInt();
		
		//address
		System.out.println("Enter flat no>>");
		int flat_no=scanner.nextInt();
		System.out.println("Enter street name>>");
		String Street_name=scanner.next();
		System.out.println("Enter emp mob_no.>>");
		int mobno=scanner.nextInt();
		
		Employee emp= new Employee();
		emp.setEmpid(id);
		emp.setEmpname(name);
		emp.setEmpsalary(salary);
		
		System.out.println(emp.getEmpid());
		System.out.println(emp.getEmpname());
		System.out.println(emp.getEmpsalary());
		
	       Address address=new Address();
	       address.setFlatno(flat_no);
	       
	       
	       address.setMobilenumber(mobno);
	      
	       address.setStreetname(Street_name);
	       
	       emp.setAddress(address);
	      
	     Address add= emp.getAddress();
	     System.out.println(emp.getAddress().getFlatno());  
	     System.out.println(emp.getAddress().getMobilenumber()); 
	     System.out.println(emp.getAddress().getStreetname()); 
	 }
	
	public static void main(String[] args) {
		
		getEmpDetails();
	}
	
	
	

}
