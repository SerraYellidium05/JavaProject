package test;

import com.BankAccount.BankAccount;
import com.UserTransaction.UserTransaction;

public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000.0);
		Thread t1 = new Thread(new UserTransaction(account, true, 200.0));
		Thread t2 = new Thread(new UserTransaction(account, false, 150.0));
		Thread t3 = new Thread(new UserTransaction(account, true, 300.0));
		Thread t4 = new Thread(new UserTransaction(account, false, 400.0));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
		System.out.println("Final Balance: " + account.getBalance());
		}
}
