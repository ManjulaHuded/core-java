package com.xworkz.bankapp;

import com.xworkz.bankapp.Current.CurrentAccount;
import com.xworkz.bankapp.Savings.SavingAccount;
import com.xworkz.bankapp.bank.BankAccount;

public class BankAccountTester {
	
	public static void main(String[] args) {
		
	BankAccount account = new BankAccount();
	account.deposit(5000);
	account.deposit(7000);
	account.withDraw(1000);
	System.out.println("My account balance is" + account.getBalance());
	
	BankAccount freindsAccount = new BankAccount();
	freindsAccount.deposit(700);
	freindsAccount.deposit(4000);
	//String dillAccount = null;
	//transferring amount from my account to freinds account
	
	account.transfer(500.00,freindsAccount);
	System.out.println("My Account Balance is" + account.getBalance());
	
     System.out.println("The freinds account balance is" + freindsAccount.getBalance());
     
    SavingAccount savingAccount = new SavingAccount();
    savingAccount.deposit(2000);
    savingAccount.deposit(3000);
    savingAccount.withDraw(1500);
    System.out.println("My Saving Account balance is" + savingAccount.getBalance());
    
    SavingAccount maaSavingAccount = new SavingAccount();
    maaSavingAccount.deposit(800);
    maaSavingAccount.deposit(200);
    
    savingAccount.transfer(2000, maaSavingAccount);
    System.out.println("My Saving Account balance is " + savingAccount.getBalance());
    
    System.out.println("My Mom's saving account balance is " + maaSavingAccount.getBalance());
    
    CurrentAccount currentAccount = new CurrentAccount();
    currentAccount.deposit(5000);
    currentAccount.deposit(2000);
    currentAccount.withDraw(1000);
    System.out.println("My current account balance is " + currentAccount.getBalance());
    
    CurrentAccount sisCurrentAccount = new CurrentAccount();
    sisCurrentAccount.deposit(2000);
    sisCurrentAccount.deposit(200);
    
    currentAccount.transfer(500, sisCurrentAccount);
    System.out.println("My current account balance is " + currentAccount.getBalance());
    System.out.println("My sis current account balance is " + sisCurrentAccount.getBalance());
    
	
	SavingAccount save = new SavingAccount(0.7);
	save.interestRate =0.7;
	save.deposit(1500);
	save.periodicInterest();
	System.out.println(save.getBalance());
	
	}

}