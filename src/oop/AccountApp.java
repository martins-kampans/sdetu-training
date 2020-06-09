package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		System.out.println(la);
		la.increaseRate();
		la.setRate();
		la.setAmmortSchedule();
		la.setTerm(5);
		
		IRate account1 = new LoanAccount();
		
	}

}
