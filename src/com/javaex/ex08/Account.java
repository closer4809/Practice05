package com.javaex.ex08;

public class Account {

    private String accountNo;
    private int balance;
    static int money ;
    static int result ;
    
    

    //생성자 작성
    public Account() {
		
	}
    
    public Account(String accountNo, int balance) {
    	this.accountNo = accountNo;
		this.balance = balance;
	}
    
    //필요한 메소드 작성
    public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int money) {
		result = result + money;
		System.out.println(result);
		
	}
	
	public void withdraw(int money) {
		result = result - money;
		System.out.println(result);
	}

	public void showBalance() {
		result = result;
		System.out.println(result);
	}


}
