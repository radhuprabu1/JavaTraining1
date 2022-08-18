package lab;

public class StudentdBApp {
	public static void main(String[] args) {
		StudentdB student1=new StudentdB("Radhakrishnan", "447506455205");
		student1.payTution(2000000);
		student1.enroll("Math101");
		student1.enroll("History202");
		student1.showCourses();
		
		student1.setPhoneNum("9514619564");
		student1.checkBalance();
		student1.toString();
		System.out.println(student1.toString());
		
		
	}
	
	

}


