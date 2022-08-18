package oops;

public class LoanAccount implements IRate{
	
	@Override //overriding already created method in IRate
	public void setRate() {
		System.out.println("Rate:");
	}
	@Override
	public void increaseRate() {
		System.out.println("Increase Rate");
	}
	public void setAmmortSchedule() {
		System.out.println("Ammortization Schedule");
	}
	public void setTerm(int Term) {
		System.out.println("Setting the Term to "+Term+" years.");
	}

}
