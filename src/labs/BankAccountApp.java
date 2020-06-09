package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("465329874", 1000.50);
//		BankAccount acc2 = new BankAccount("655329887", 2000);
//		BankAccount acc3 = new BankAccount("325329856", 2500);
		System.out.println();
	
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		
		acc1.accrue();
		System.out.println(acc1.toString());
   }
}
class BankAccount implements IInterest{
	private static int iD = 1000;
	private String accountNumber;
	private static final String routingNumber = "005400657";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		System.out.println("Your iD is: " + iD);
		setAccountNumber();
		System.out.println("YOur balance is: " + balance);
	}
	//methods
	private void setAccountNumber() {
		int random = (int)(Math.random() *100);
		System.out.println("Random int number: " + random);
		accountNumber = iD + "" + random + SSN.substring(0, 2);
		System.out.println("Your account number is: " + accountNumber);
	}
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
		
	}
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making deposit: " + amount);
		showBalance();
	}
	public void showBalance() {
		System.out.println("Your balance is: " + balance);
	}
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();	
	}
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Account Number: " 
	+ accountNumber + "]\n" +"[Routing Number: " + routingNumber 
	+ "]\n" + "[Balance " + balance + "]";
				
		
	}
	//setters and getters
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
