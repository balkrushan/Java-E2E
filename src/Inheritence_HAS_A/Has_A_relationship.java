package Inheritence_HAS_A;

import Inheritence_Aggrigation.Childclass;

public class Has_A_relationship {
	
	/*1. Can we take Class name as a data type in java ?
	  Yes we can take class name as a data type
	  
	  String b;
	  Testclass test;   // class name as adata type
	  
	  */
	
	public Childclass child ; 
	
	public void HAS_A(Childclass child) {
		child=new Childclass();
		child.m0();
		child.m1();
	}
	public static void main(String[] args) {
		
		Has_A_relationship has_a=new Has_A_relationship();
		has_a.HAS_A(new Childclass());
	}

}
