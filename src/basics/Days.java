package basics;

public class Days {
	public static void main(String[] args) {
	
		String dayOfWeak = "July";
		
		switch(dayOfWeak) {
		case "Monday":
			System.out.println("Today is Monday");
			break;
		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
		default:
			System.out.println("Enter days of weak");
			break;
		}
	}
}
