package oops;

public interface IRate {
	/*Tells us what to do but not how to do
	 * Methods are public by default
	 * Variables are public, static, final by default
	 * Interface cannot be instatiated-*NO CONSTRUCTORS*
	 * A class can implement multiple interfaces but not multiple parent class
	 * By interface JAVA supports *MULTIPLE INHERITANCE*
	 * An interface can extend another interface(s).
	 */
	public void setRate(); 		//these are methods but { } is not used
	public void increaseRate();

}
