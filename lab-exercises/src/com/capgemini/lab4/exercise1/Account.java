package com.capgemini.lab4.exercise1;

public class Account {
	
	// data members
	private long accNum;
	private Double balance;
	private Person accHolder;
	
	
	public Account() {
		super();
	}
	
	public Account(String name,float age,long accNum,double balance)
	{
		this.accNum=accNum;
		this.balance=balance;
		Person p = new Person(name,age);
		accHolder = p;
	}

	//getters and setter
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double amt)
	{
		this.balance = this.balance+amt;
		setBalance(balance);
	}
	
	public void withdraw(double amt)
	{
			if((this.balance-amt)<500)
			{
				System.out.println("Minimum Balance Must be 500 !");
			}
			else
			 {
				this.balance=this.balance-amt;
				setBalance(balance);
			 }
	}
	@Override
	public String toString() {
		return "Account Number=" + accNum + "\nBalance=" + balance + 
				"\nAccount Holder's" + accHolder;
	}
	
	
}

