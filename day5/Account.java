package com.day5;
import java.util.Scanner;

public class Account {
	private int accountId;
	private String accType;
	private int balance;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public boolean withdraw(int curbal) {
		if(curbal > withamt) {
			double amt=curbal - withamt;
			System.out.println(amt);
			return true;
		}else {
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
	}
}
class AccountDeatils{
	Account ac=new Account();
	public Account getAccountDetails() {
		int bal=ac.getBalance();
		return new Account();
		
	}
		public static void main(String[] args) {

	}
}
