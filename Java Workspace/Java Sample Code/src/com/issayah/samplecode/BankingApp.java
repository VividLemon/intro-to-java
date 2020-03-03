package com.issayah.samplecode;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account first = new Account();
		first.setFirstName("firstPersonFirstName");
		first.setLastName("firstPersonLastName");
		first.setaccountNumber(101110501);
		
		Account second = new Account();
		second.setFirstName("secondPersonFirstName");
		second.setLastName("secondPersonLastName");
		second.setaccountNumber(252052050);
		
		second.deposit(100);
		second.deposit(1200);
		second.deposit(1300);
		second.deposit(1400);
		second.withdraw(2000);
		second.getDetails();
		System.out.println(second.getFirstName());
		System.out.println(second.getLastName());
		System.out.println(second.getAccountNumber());
		System.out.println(second.getBalance());
		
		first.deposit(1200);
		first.deposit(100);
		first.deposit(1300);
		first.deposit(1400);
		first.withdraw(2000);
		first.getDetails();
		System.out.println(first.getFirstName());
		System.out.println(first.getLastName());
		System.out.println(first.getAccountNumber());
		System.out.println(first.getBalance());
		
		if(first.equals(second)) {
			System.out.println("Same account");
		}else {
			System.out.println("Different accounts");
		}
		if(first.equals(first)) {
			System.out.println("Same account");
		}else {
			System.out.println("Different accounts");
		}
		
		Account a3 = new Account("Jerry", "Thomas",  1234, 10000000);
		
	}

}
