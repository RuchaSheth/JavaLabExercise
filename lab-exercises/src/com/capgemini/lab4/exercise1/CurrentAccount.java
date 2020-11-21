package com.capgemini.lab4.exercise1;

public class CurrentAccount extends Account {
	private double overDraftLimit ;
	

	public CurrentAccount(String name, float age, long accNum, double balance,double overdraftLimit) {
		super(name, age, accNum, balance);
		this.overDraftLimit=overdraftLimit;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdraw(double amt) {
		double totalBalance = this.getBalance()+overDraftLimit;
		if((totalBalance-amt)==0)
		{
			System.out.println("OverDraft Limit is reached .");
		}
		else
		{
			if(super.getBalance()<amt)
			{
				super.setBalance(0.0);
				this.overDraftLimit=totalBalance-amt;
				
			}
			else
			{
				super.setBalance(super.getBalance()-amt);
			}
		}
	}
	
}
