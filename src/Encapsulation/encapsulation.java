package Encapsulation;

import java.util.Scanner;


public class encapsulation {
 private static Employee emp;
 private static Test e;
	
	static int salary=0;
	
	int empsal;
	
	 void m1() {
		
		this.salary=7000;
		System.out.println(salary);
	}
	 
	static void getEmpDetails() {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("enter empid");
		int id=scan.nextInt();
		e=new Test();
		 e.setEmpid(id);
		System.out.println("enter empname");
		String str=scan.next();
		 e.setEmployeename(str);
		System.out.println("enter empsalary");
		int empsal=scan.nextInt();
		 e.setEmpsalary(empsal);
		 
		
	
		 System.out.println("emp id is:" +e.getEmpid());
		 System.out.println("emp name is:" +e.getEmployeename());
		 System.out.println("emp salary is:" +e.getEmpsalary());
	 }
	 
	 
   public static void main(String[] args) {
	   
	encapsulation capsule=new encapsulation ();
	capsule.m1();
	emp=new Employee();
	
	
	
	
	
	Scanner scan=new Scanner (System.in);
	System.out.println("enter salary");
	int a=scan.nextInt();
	emp=new Employee();
	emp.setsalary(a);
	
	getEmpDetails();
}   
}
