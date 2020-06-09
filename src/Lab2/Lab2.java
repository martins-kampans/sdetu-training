package Lab2;

public class Lab2 {
	public static void main(String[] args){
		Student stu1 = new Student("Janelle", "321456987");
		Student stu2 = new Student("Thomas", "456879546");
		Student stu3 = new Student("Elizabeth", "615326574");
		
		
	}
}
class Student{
	private static int iD = 1000;
	private int userId;
	private String name;
	private String ssn;
	private String email;
	
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
		
	}
	private void setEmail(){
		email = name.toLowerCase() + iD +  "@sdetuniversiy.com";
		System.out.println("Your email: " + email);
		
	}
	private void setUserId(){
		int max = 9000;
		int min = 1000;
		int randNum = (int)(Math.random() * (max - min));
		randNum = randNum + min;
		System.out.println(randNum);
	}
	
	
}
