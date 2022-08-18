package basics;

public class LoopsExercise {
	public static void main(String[] args) {
		//calculate the sum of numbers
		int sum=0;
		for(int i=10;i>=1;i--) {
			sum+=i;	
		}
		System.out.println(sum);
		
		//to find the factorial of 'x'
		int x;
		int y=1;
		for(x=5;x>=1;x--) {
			y*=x;	//similar to y=y*x
			
		}
		System.out.println(y);	
		
		
		
	}

}
