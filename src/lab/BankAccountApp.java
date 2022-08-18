package lab;

public class BankAccountApp{
	public static void main(String[] args) {
		
		BankAccount acc1=new BankAccount("4475 0645 5205",100000);
		acc1.setAccHolder("RADHAKRISHNAN P");
		System.out.println(acc1.getAccHolder()+"\n");
		acc1.makeDeposit(20000);
		acc1.makeDeposit(10000);
		acc1.withdraw(55000);
		acc1.accrue();
		System.out.println(acc1.toString());
		
	}
	
}

class BankAccount implements IIRate{
	//Properties of bank account;
	private static int iD=1000;	//Internal ID
	private String accNum;	//iD+ random 2 digit # + 1st 2 of Aadhaar #;
	private String accHolder;
	private static final String ifsc="SBIN000016";
	private String aadharNum;
	private double balance;
	
	public BankAccount(String aadharNum, double initDeposit) {
		balance+=initDeposit;
		this.aadharNum=aadharNum;
		iD++;
		setAccountNumber(initDeposit);
		
	}
	
	private void setAccountNumber(double initDeposit) {
		final int random=(int) (Math.random()*100); //casting to int
		accNum= iD + ""+random +aadharNum.substring(0, 5);
		System.out.println("YOUR A/C NUMBER:"+ accNum);
		System.out.println("YOUR INITIAL DEPOSIT:Rs."+initDeposit);
		
	}
	
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public String getAccHolder() {
		return accHolder;
	}

	public void makeDeposit(double amount) {
		balance+=amount;
		showActivity("DEPOSIT");
		System.out.println("DEPOSIT AMOUNT:Rs."+amount+"/-");
		System.out.println("YOUR NEW BALANCE:Rs."+balance+"/-"+'\n');
	}
	public void withdraw(double amount) {
		balance-=amount;
		showActivity("WITHDRAW");
		System.out.println("WITHDRAWN AMOUNT:Rs."+amount+"/-");
		System.out.println("YOUR NEW BALANCE:Rs."+balance+"/-"+'\n');
	}
	private void showActivity(String activity) {
		System.out.println("Your Recent Transaction Activity:"+activity);
		
	}
	@Override
	public void accrue() {
		balance*=(1+rate/100);
		showActivity("ACCRUE");
	}
	@Override
	public String toString() {
		return "[NAME:"+accHolder+"]\n[ACCOUNT NUMBER:"+accNum+"]\n[IFS CODE:"+ifsc+"]\n[BALANCE:Rs."+balance+"]";
	}
}
