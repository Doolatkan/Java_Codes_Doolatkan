package day33_ClassObjects_Constructers;

public class BankAccount {

	//instance variable
	double balance;
	
	//this constructor sets the starting balance to 0.0
	public BankAccount() {
		balance = 0.0;
	}
	
	//this constructor sets the starting balance to the value passes as an argument
	public BankAccount(double startBalance) {
		balance = startBalance;
	}
	
	public BankAccount(String str) {
		balance = Double.valueOf(str);
	}
	
	public void deposit(String str) {
		this.balance = balance + Double.parseDouble(str);
	}
	
	public double getBalance() {
		return balance;
		
	}
}
