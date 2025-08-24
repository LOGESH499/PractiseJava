package javapractise;

import java.util.Scanner;

public class ATMMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int choice;                //store user choice
		double balance=1000.0;     //initial balance
		
		
		//do while loop will repeat untill user choose Exit
		
		do {
			//Print Menu
			
			System.out.println("\n---ATM Menu---");
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Exit");
			System.out.println("Enter your Choice:");
			choice=scan.nextInt();
			
			//perform action based on choice
			
			switch(choice) {
			
			case 1://check balance
				System.out.println("Your balance:₹"+balance);
				break;
				
			case 2://deposit
				System.out.println("Enter deposit amount:");
				double deposit=scan.nextDouble();
				balance +=deposit; //add deposit balance
				System.out.println("Deposit successful New Balance:₹"+balance);
				break;
				
			case 3://Withdraw
				System.out.println("Enter Withdraw amount:");
				double withdraw=scan.nextDouble();
				
				if(withdraw <= balance) {
					balance -=withdraw; //add deposit balance
					System.out.println("Withdraw successful New Balance:₹"+balance);
				}else {
					System.out.println("Insufficient balance!");
				}
				break;
				
			case 4://exit
				System.out.println("Exiting ATM...Thank you!");
				break;
				
				default://wrong choice
					System.out.println("Invalid choice! Please try again");
				
			}
		}while(choice!=4);
		
	}

}
