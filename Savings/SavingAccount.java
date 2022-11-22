package com.xworkz.bankapp.Savings;

import com.xworkz.bankapp.bank.BankAccount;

public class SavingAccount extends BankAccount{
	
	public String name;
	public double interestRate;
	
	public SavingAccount () {
		System.out.println("Constructor object is createds");
	}
	
	public SavingAccount(double interestRate) {
		this.interestRate = interestRate;
		System.out.println("Saving account object is created");
	}
	
	public void periodicInterest() {
		double newbalance = getBalance()*interestRate/100;
		deposit(newbalance);
	}
	
	

}
