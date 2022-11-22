package com.xworkz.bankapp.bank;

public class BankAccount {
	
	String name;
	String idscCode;
	String branchName;
	
	String accountNo;
	//Encapsulation
	private double balance;
	
	public double withDraw(double balance) {
		System.out.println("The withDraw amount is " + balance );
		this.balance = this.balance-balance;
		return this.balance;
		//balance = 5000;
	}
	
	public double deposit(double balance) {
		//0.0+500
		System.out.println("Amount to be depoisted" + balance);
		this.balance = this.balance+balance;
		return this.balance;
	}
	
	public void transfer(double amount,BankAccount freidsAccount) {
		System.out.println("Transferring to another");
		withDraw(amount);
		freidsAccount.deposit(amount);
		System.out.println("Transferring Done... transaction successfull");
		
		
		
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}

}
