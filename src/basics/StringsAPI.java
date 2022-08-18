package basics;

public class StringsAPI {
	public static void main(String[] args) {
		String bookTitle = "The Lord of the Rings";
		String wordContains = "Rings";
		if(bookTitle.contains(wordContains)) {
			System.out.println("The book contains the word "+ "'" +wordContains+"'");
		}
		String browser="Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is "+ browser);
		}
		String firstName="Radhakrishnan";
		String lastName="Prabakaran";
		String aadharNum="447506455205";
		System.out.println("The Pwd is " +lastName.substring(0,1)+firstName.substring(0, 3)+aadharNum.substring(0, 4));
	}

}
