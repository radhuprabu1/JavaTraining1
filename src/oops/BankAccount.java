package oops;

public class BankAccount implements IRate{ //parent class/super class/base class
	//Define variable
	String accNum;//also a instance var
	
	//static >> belongs to the CLASS not the obj instance
	//final >> constant (often used /w static final)
	static final String ifscCode="SBIN00012"; //will be same for all acc of a bank
	
	//Instance variable-can be used everywhere in the class
	private String accHolder;
	private String aadharNum;
	String accType;
	double balance;
	
	//Constructors definition:unique methods
		//1.They are used to define/setup/initialize properties of an object
		//2.Constructors are IMPLICITLY called upon INSTANTIATION
		//3.The same name as class itself
		//4.Constructors have NO RETURN TYPE

	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	//OVERLOADING: Calling same method /w diff args
	BankAccount(String accountType){	//1st overloading method
		System.out.println("Account Type: "+accountType);
	}
	BankAccount(String accountType, double initDeposit){ //2nd oL method
		
		//initDeposit,Msg,accountType are all local variables
		
		System.out.println("Account Type: "+accountType);
		System.out.println("Initial Deposit: Rs."+initDeposit);
		String Msg=null;
		if (initDeposit < 1000) {
			Msg="ERROR: Minimum deposit must be Rs.1000";
			System.out.println(Msg);
		}else {
			Msg="Thanks for your Initial Deposit of Rs."+initDeposit;
		}
		System.out.println(Msg);
		balance=balance+initDeposit;
	}
	//Define methods
	void deposit(double amount) {
		balance+=amount;
		showActivity("DEPOSIT");
		
	}
	void withdraw(double amount) { //default access will be avail within the package only
		balance-=amount;
		showActivity("WITHDRAW");
		
	}
	private void showActivity(String activity) {//private method will be available only within the class
		System.out.println("YOUR RECENT ACTIVITY: "+activity);
		System.out.println("YOUR NEW BALANCE:Rs."+balance);
	}
	void checkBalance() {
		System.out.println("Balance: "+balance);
		
	}
	void getStatus() {
		
	}
	//Getters/Setters
	//Allow the user to define the name
	public String getAccHolder() {
		return(accHolder);
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = "ACCOUNT HOLDER:" + accHolder;
	}
	public String getAadharNum() {
		return aadharNum;
	}
	public void setAadharNum(String aadharNum) {
		this.aadharNum = "AADHAR NUMBER:"+ aadharNum;
	}
	
	@Override //Overriding the inherent toString method
	public String toString() { //public - will be available all over the project
		return("[NAME:"+accHolder+"|A/c NUMBER:"+accNum+"|BALANCE:Rs."+balance+"]");
	}
	@Override
	public void setRate() {
		System.out.println("SETTING RATE");
		
	}
	@Override
	public void increaseRate() {
		System.out.println("INCREASING RATE");
		
	}
}
