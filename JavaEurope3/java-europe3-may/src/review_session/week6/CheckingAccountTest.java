package review_session.week6;

public class CheckingAccountTest {

	public static void main(String[] args) {


		//creat an account
		CheckingAccount clientOne = new CheckingAccount();
		
		clientOne.accountNumber = 34154545555L;
		clientOne.accountHolder = "Mike";
		clientOne.balance  = 500.0;
		
		
		
		clientOne.getAccountInfo();
		
		//creat another account and set data using method
		CheckingAccount clientTwo = new CheckingAccount();
		
		clientTwo.setInfo(750.0, 65497845465556L, "Maria");
		
		
		//test deposit
		
		clientOne.deposit(300);
		clientOne.getAccountInfo();
		
		//test withdraw
		
		clientOne.withdraw(100);
		clientOne.getAccountInfo();
		
		//call purches method
		
		CheckingAccount myAccount = new CheckingAccount();
		
		myAccount.setInfo(200, 5456456456465L, "Mike Smith");
		myAccount.purchase("JavaBook", 120);
		
		System.out.println("Current Balance: " + myAccount.balance);
		
		myAccount.purchase("Shoes", 100);
		myAccount.getAccountInfo();
		
		myAccount.deposit(100000);
		myAccount.getAccountInfo();
		
		
		
		

	}

}
