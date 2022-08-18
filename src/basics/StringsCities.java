package basics;

public class StringsCities {

	public static void main(String[] args) {
		//Declare and define an array
		String[] cities= {"Chennai", "Hyderabad","Bangalore","Mumbai"};
		System.out.println(cities[2]);
		
		//Declare and define an array(only the size)
		String[] states=new String[4];
		states[0]="Tamil Nadu";
		states[1]="Karnataka";
		states[2]="Kerala";
		states[3]="Andhra";
		System.out.println(states[1]);
		
		//Declae an array
		String[] countries;
		
		//Define the array
		countries=new String[3];
		countries[0]="India";
		countries[2]="Pakistan";
		countries[1]="China";
		System.out.println(countries[2]);
		
	}

}
