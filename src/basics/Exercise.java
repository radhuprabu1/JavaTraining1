package basics;

public class Exercise {
	public static void main(String[] args) {
		
   /****fib(0)=0;
		fib(1)=1;
		fib(2)=fib(1)+fib(0)= 1 + 0 = 1;
		fib(3)=fib(2)+fib(1)= 1 + 1 = 2;
		fib(4)=fib(3)+fib(2)= 2 + 1 = 3;
		fib(5)=fib(4)+fib(3)= 3 + 2 = 5;****/
		
		//for loop-Fibanocci num
		int n = 1, firstTerm = 0, secondTerm = 1;
	    System.out.print("Fibonacci Series till " + n + " terms: ");

	    for (int i = 0; i <= n; ++i) {
	      System.out.print(firstTerm + ", "); //(0,1,1,

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;//nextTerm =(0+1=1)
	      firstTerm = secondTerm;	//now firstTerm = 0
	      secondTerm = nextTerm;	//now secondTerm = 1
	    }
	}

}
