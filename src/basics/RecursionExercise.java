package basics;

public class RecursionExercise {
	
	public static void main(String[] args) {
		 /* Fibonacci Formula:
		  * fib(0)=0;
		  * fib(1)=1;
		  * fib(n)=fib(n-1)+fib(n-2);
		  * fib(2)=fib(1)+fib(0)= 1 + 0 = 1;
		  * fib(3)=fib(2)+fib(1)= 1 + 1 = 2;
		  * fib(4)=fib(3)+fib(2)= 2 + 1 = 3;
		  * fib(5)=fib(4)+fib(3)= 3 + 2 = 5;
		  */
		 /* Factorial Formula:
		  * fact(0)=1;
		  * fact(1)=1;
		  * fact(n)=n*fact(n-1)
		  * fact(2)=2*fact(1)=2;
		  * fact(3)=3*fact(2)=6;
		  * fact(4)=4*fact(3)=24;
		  * fact(5)=5*fact(4)=120;
		  */
		System.out.println(fib(6));
		System.out.println(fact(4));
		   
	}
	static int fib(int n) {
		 if (n == 0) {
			 return 0;
		 }else if (n == 1){
			 return 1;
		 }
		 return( fib(n-1) + fib(n-2) );

	}
	static int fact(int n){    
		  if (n == 0)  { 
		    return 1;    
		  }    
		  return(n * fact(n-1));
	}

}
