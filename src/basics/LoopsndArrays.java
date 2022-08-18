package basics;

public class LoopsndArrays {
	public static void main(String[] args) {
		String[] states=new String[5];
		states[0]="Tamil Nadu";
		states[1]="Karnataka";
		states[2]="Kerala";
		states[3]="Andhra";
		states[4]="Telangana";
		 
		//Do Loop: enters the loop and test the condtn
		int i=0;
		do {
			System.out.println("States: "+ states[i]);
			i++;
		}while(i<=4);
		System.out.println("***********\n");
		
		//While Loop: Test the condtn and enters the loops
		int n=0;
		boolean stateFound=false;
		while(!stateFound) {	//loop starts executing only in true condtn
			//String state = states[n];
			System.out.println("States: "+states[n]);
			if (states[n]=="Kerala") {
				System.out.println("State Found!");
				stateFound=true;
			}
			n++;
		}
		System.out.println("\nFOR LOOP STATEMENT\n");
		//For loop: Best structure for iteration through any array
		
		int x;
		boolean stateNotFound=false;
		for(x=0; !stateNotFound;x++) {
			System.out.println(states[x]);
			if (states[x]=="Kerala") {
				System.out.println("State Not Found");
				stateNotFound=true;
			}
			//System.out.println(states[x]);
		}
				
	}

}
