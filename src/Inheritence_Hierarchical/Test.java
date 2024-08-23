package Inheritence_Hierarchical;

public class Test {
	
	public static void main(String[] args) {
		
		HomeLoan homeloan=new HomeLoan();
		
		homeloan.getHomeLoanDetails();
		homeloan.getLoanDetails();
		
		CarLoan carloan=new CarLoan();
		carloan.getCarLoanDetails();
		carloan.getLoanDetails();
		
	}
	
	

}
