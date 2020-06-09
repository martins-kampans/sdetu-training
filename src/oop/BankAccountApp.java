package oop;

public class BankAccountApp {
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("123456");
		System.out.println("Ssn: " + acc1.getSsn());
		acc1.setRate();
		acc1.increaseRate();
//		acc1.accountNumber = "3423324";
//		
//		acc1.balance = 1000;
//		acc1.deposit(1500);
//		acc1.withdraw(150);
//		
//		System.out.println(acc1.toString());
//		
//	
//		BankAccount acc2 = new BankAccount("Checking Account");
//		
//		BankAccount acc3 = new BankAccount("Saving Account", 1500);
//		acc3.checkBalance();
//		
//		//Demo for inheritence
//		CDAccount cd1 = new CDAccount();
//		cd1.interestRate = "4.5";
//		cd1.balance = 3000;
//		cd1.name = "Juan";
//		cd1.accountType = "CD Account";
//		System.out.println(cd1.toString());
//		cd1.compount();
		
		
		
		
		
		
		
	}
}
