package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		
		//Let's create a variable to define career
		//Declare variable
		String career;
		System.out.println("Program is starting");
		//Define the variable 
		career="Software Developer";
		System.out.println("My career is "+ career);
		//Declare and define
		int hoursPerWeek =45;
		int weeksPerYear=50;
		double rate=120;
		double salary=hoursPerWeek*weeksPerYear*rate;
		System.out.println("My salary as a "+career +" at the rate of Rs."+rate+" per hour is Rs."+salary+" per year.");
		
		
		
		
	}

}
