package OOPSpractise;


class BankAccount{
	//private varaiable
	private int accountNumber;
	private double balance;
	
	//constructor
	public BankAccount(int accountNumber,double initialBalance) {
		this.accountNumber=accountNumber;
		if(initialBalance>=0) {
			this.balance=initialBalance;
		}
		else {
			this.balance=0;
			System.out.println("Initial balance cannot be negative.Balance set to 0");
		}
	}
	
	//deposit method
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposited:"+amount);
		}
		else {
			System.out.println("Invalid deposit amount!"); 
		}
	}
	
	//withdraw method
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("Withdrawn:"+amount);
		}
		else {
			System.out.println("Insufficient balance or Invalid amount!"); 
		}
	}
	
	//get balance (no direct variable access)
	public double getBalance() {
		return balance;
	}
	
	//get account number
	public int getAccountNumber() {
		return accountNumber;
	}
}

public class BankAccountEx {

	public static void main(String[] args) {
		
		//crate account
		BankAccount b1= new BankAccount(12345,1000);
		
		//perform transcations
		b1.deposit(500);
		b1.withdraw(300);
		b1.withdraw(1500);//shold show insufficient balance
		
		
		//check balance
		
		System.out.println("Final Balance in account"+b1.getAccountNumber() + ":" + b1.getBalance()); 
		
		
	}

}
