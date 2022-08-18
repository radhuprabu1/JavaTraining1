package oops;

public class AccountApp {
	public static void main(String[] args) {
		LoanAccount la=new LoanAccount();
			la.increaseRate();
			la.setRate();
			la.setAmmortSchedule();
			la.setTerm(20);
			
			//3.Polymorphism changes where we are Pointing
			IRate account1=new LoanAccount();
			account1.increaseRate();
			account1.setRate();
			
	}
	
}
