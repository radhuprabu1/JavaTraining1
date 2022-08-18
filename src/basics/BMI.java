package basics;

public class BMI {
	public static void main(String[] args) {
		//This program will tell the body type based on BMI
		
		double height=1.82;
		int weight=65;
		double bmi=weight/Math.pow(height,2);//Math.pow-power a no.
		if (bmi<18) {
			System.out.println("Your Body type is lean");
			
		}
		else if ((bmi>=18)&&(bmi<=24)) {
			System.out.println("Your Body type is ideal");
		}
		else{
			System.out.println("You are obese");
			
		}
	}

}
