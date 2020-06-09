package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		bookTitle = "The lord of the Rings";
		String wordChoice = "Ring";
//		
//		
//		if(bookTitle.contains(wordChoice)) {
//			System.out.println("The book contains the word " + wordChoice );
//		}
//		String browser = "Chrome";
//		if(browser.equalsIgnoreCase("chrome")) {
//			System.out.println("The browser is chrome");
//		}
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "1234567";
		
		System.out.println(firstName.substring(0, 1));
		System.out.println(lastName.substring(0, 1));
		System.out.println(SSN.substring(5));
		
		System.out.println("There are " + SSN.length() + " digits in the SSN" );
		

	}

}
