package lab;

public class StudentdB {
	private String name;
	private String aadharNum;
	private String emailId;		//Name+@+gmail.com;
	private static int iD=1001;
	private String userId;	//static id+math.random()*10000+aadhar last 4 digits
	private String phoneNum;
	private String city;
	private String state;
	private double balance;
	private String courses;
	private double costOfCourse=2000;
	
	public StudentdB(String name, String aadharNum) {
		this.name=name;
		this.aadharNum=aadharNum;
		iD++;
		setuserId();
		setemailId();
	}
	
	private void setemailId() {
		emailId = name.toLowerCase()+"@studb.com";
		System.out.println("Your Email ID is:"+emailId);
		
	}
	private void setuserId() {
		final int random=(int) (Math.random()*10000);
		userId = iD+""+random+aadharNum.substring(8, 12);
		System.out.println("Your User ID is "+userId);
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void payTution(double amount) {
		balance-=amount;
		System.out.println("Your paid amount is Rs."+amount);
	}

	public void enroll(String course) {
		this.courses=this.courses+""+course;
		balance+=costOfCourse;
	}
	public void checkBalance() {
		System.out.println("Your balance is Rs."+balance);
	}
	public void showCourses() {
		System.out.println(courses);
	}
	@Override
	public String toString() {
		return("[NAME:"+name+"] [USER ID:"+userId+"] [EMAIL ID:"+emailId+"] [BALANCE:Rs"+balance+"]");
	}
	
}