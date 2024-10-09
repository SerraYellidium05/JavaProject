package com.BankAccount;

public class BankAccount {
	private double balance;
	public BankAccount(double intialBalance) {
		this.setBalance(intialBalance);
	}
	public double getBalance1() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public synchronized void deposit(double amount) {
		balance+=amount;
		System.out.println(Thread.currentThread().getName()+"deposited"+amount+"current balance"+balance);
	}
	public synchronized void withdraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println(Thread.currentThread().getName()+"withdrew"+amount+"current balance"+balance);
		}
		else {
			System.out.println(Thread.currentThread().getName()+"tried to withdraw"+amount+"insufficient"+balance);
		}
	}
	public synchronized double getBalance() {
		return balance;
	}
}
