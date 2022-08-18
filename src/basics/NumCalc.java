package basics;

public class NumCalc {

	public static void main(String[] args) {
		
		printName();
		int numA=50;
		int numB=200;
		addNumbers(numA,numB);
		int product =multiplyNumbers(numA,numB);
		System.out.println("The product of the numbers: "+numA+" and "+numB+ " is "+product);
		
	}
	static void printName() {
		//This fn will print the name
		System.out.println("My Name is Radhakrishnan");
	}
	static void addNumbers(int numberA, int numberB) {
		//This fn will add the numbers 
		int sum=numberA+numberB;
		System.out.println("The sum of the numbers: "+numberA+ " and " +numberB+" is " + sum);
	}
	static int multiplyNumbers(int valueA, int valueB) {
		//This fn will multiply the numbers and return the product
		int product=valueA*valueB;
		addNumbers(product+60, product);//calling addNumbers fn inside multiplyNumbers fn
		return product;
		
	}

}
