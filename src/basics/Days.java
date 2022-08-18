package basics;

public class Days {
	public static void main (String[] args) {
		//Execute diff blocks of code based on the value of a condtn
		
		String dayOfWeek="Wednesday";
		
		switch (dayOfWeek) { //w/o break statement it'll execute all the lines
		case "Monday":System.out.println("Today is Mon"); break;
		case "Tuesday":System.out.println("Today is Tue"); break;
		case "Wednesday":System.out.println("Today is Wed"); break;
		case "Thursday":System.out.println("Today is Thu"); break;
		case "Friday":System.out.println("Today is Fri"); break;
		
		}
		
	}

}
