package com.capgemini.lab4.exercise1;

public class Exercise1Tester {

	public static void main(String[] args) {
	
	System.out.println("******Account 1 Details ******* ");		
	Account acc = new Account("rucha", 21, 6021999, 1000);
	acc.withdraw(500);
	System.out.println(acc);
		
	System.out.println("\n******Account 2 Details ******* ");	
	CurrentAccount current = new CurrentAccount("Smith",24,1001,2000.0,3000.0);
	current.deposit(2000);
	System.out.println(current);
	
	
	System.out.println("\n******Account 3 Details ******* ");	
	SavingAccount saving = new SavingAccount("Kenny",28,1002,1000.0);
	saving.withdraw(1000.0);
	System.out.println(saving);
	}

}
