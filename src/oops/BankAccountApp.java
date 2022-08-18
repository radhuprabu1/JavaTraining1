package oops;

public class BankAccountApp {

	public static void main(String[] args) {
		//creating a new Bank Account >> think instantiate an object
		
		BankAccount acc1=new BankAccount(); //constructor is called
		acc1.accNum="00060108013";
		
		acc1.setRate();
		acc1.increaseRate();
		
		//ENCAPSULATION:Public API methods
		acc1.setAccHolder("Radhakrishnan");
		System.out.println(acc1.getAccHolder());
		acc1.setAadharNum("4475 0645 5205");
		System.out.println(acc1.getAadharNum());
		acc1.balance=1000000;
		//1.Polymorphism through Overriding (toString() method)
		System.out.println(acc1.toString());
		acc1.deposit(5000);
		acc1.deposit(5000);
		acc1.deposit(5000);
		acc1.withdraw(1000);
		
		//2.Polymorphism through overloading BankAccount() method
		BankAccount acc2=new BankAccount("Savings Account"); //1st oL method is called
		acc2.accNum="021540321321";
		
		/*BankAccount acc3=new BankAccount("Current Account", 1000000);	//2nd oL method is called
		acc3.accNum="5465464654654";
		acc3.checkBalance();
		
		//Demo inheritance
		CDAccount cd1=new CDAccount();
		cd1.balance=300000;
		cd1.interestRate="4.5";
		cd1.accHolder="Radhu";
		cd1.accType="Current Account";
		System.out.println(cd1.toString());
		cd1.compound();*/
		

	}

}
