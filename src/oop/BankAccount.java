package oop;

public class BankAccount implements IRate{
	String accountNumber;
	private static final String routingNumber = "0123456";
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	//Constructors
	
	BankAccount(){
		System.out.println("New account created");
	}
	BankAccount(String accountType){
		System.out.println("New account: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		System.out.println("New account: " + accountType);
		System.out.println("Initial deposit of : $" + initDeposit);
		String Msg = "";
		if(initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1,000";
		}else {
			Msg = ("Thanks for your initial deposit of: $" + initDeposit);
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	//Getters / Setters
	public void setName(String name) {
		this.name = "Mr " + name;
	}
	public String getName() {
		return name;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	//Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	};
	//Methods
	public void deposit(double amount){
		balance = balance + amount;
		showActivity("Deposit");
	}
	public void withdraw(double amount){
		balance = balance - amount;
		showActivity("Withdraw");
	}
	private void showActivity(String activity) {
		System.out.println("Your recent transaction: " + activity);
		System.out.println("Your new balance is: $" + balance);
	}
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	void getStatus(){
		
		
	}
	public String toString() {
		return "[ NAME: " + name + ", ACCOUNT# " + accountNumber + 
				" ROUTING# " + routingNumber + " , BALANCE: $" + balance + " ]";
	}
	
	

}
