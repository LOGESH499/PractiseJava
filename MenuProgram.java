package javapractise;

import java.util.Scanner;

public class MenuProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int choice;
		
		do {
//			System.out.println("Print Hello");
//			System.out.println("Print World");
//			System.out.println("Exit");
			System.out.println("Enter Choice:");
			choice=scan.nextInt();
			
			switch(choice) {
			case 1:System.out.println(" Hello");
			break;
			case 2:System.out.println(" World");
			break;
			case 3:System.out.println(" Exiting....");
			break;
			default: System.out.println("Invalid choice!");
			
			
			}
		}while(choice!=3);
	}

}
//Print Menu Until Exit