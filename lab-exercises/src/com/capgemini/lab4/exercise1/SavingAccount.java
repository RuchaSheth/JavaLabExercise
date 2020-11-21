package com.capgemini.lab4.exercise1;

public class SavingAccount extends Account{

	public SavingAccount(String name, float age, long accNum, double balance) {
		super(name, age, accNum, balance);
		// TODO Auto-generated constructor stub
	}


	private final Double minAmt=500.00;

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		super.withdraw(amt);
		Double wamt=this.getBalance()-amt;
		if(wamt>minAmt)
			this.setBalance(wamt);
		else
			System.out.println("Insufficient Balance !");
	}
	
}
