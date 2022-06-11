package com.question1;

public class Account {

	String accountNumber;
	double balance;
	
	public Account(String accountNumber) {
		this.accountNumber=accountNumber;
	}
	void deposit(double amount) {
		balance = balance + amount;
	}
	void withdraw(double amount)throws  InsufficientFundException{
		if(amount > balance) {
			throw new InsufficientFundException("Insufficent Balance");
		}else {
			balance=balance-amount;
		}
	}
}
class InsufficientFundException extends Exception {

	public InsufficientFundException(String msg) {
		super(msg);
	}

}

class AccountDemo{
	public static void main(String[] args) {
		Account account=new Account("123456789");
		account.deposit(12000);
		try {
			account.withdraw(40000);
			System.out.println("Successfully withdrawn "+account.balance);
		}catch(InsufficientFundException e) {
			System.out.println(e.getMessage());
		}
	}
}
