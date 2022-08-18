package oops;

class Person{
	String name;
	String email;
	String phNum;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	void eat() {
		System.out.println(name+" is eating");
	}
	void sleep() {
		System.out.println(name+" is sleeping");
	}
}
public class Demo {

	public static void main(String[] args) {
		//Instantiating an object
		Person person1=new Person();//creating an obj person1 using class Person
		Person person2=new Person();
		
		//Define some properties to the object
		person1.name="Radhakrishnan";
		person2.name="Radhu";
		person1.email="radhumahadev@gmail.com";
		person1.phNum="9514619564";
		
		//Abstraction
		person1.sleep();
		person2.eat();
		person1.walk();
		
	  /*String person11="Radhakrishnan";
		String email11="radhumahadev@gmail.com";
		String phNum11="9514619564";
		sleep(person11);*/
		

	}
   /*  static void sleep(String person11) {
		System.out.println(person11+ " is sleeping "); 	
	}
	*/

}
