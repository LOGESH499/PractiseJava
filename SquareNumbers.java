package javapractise;

import java.util.Scanner;

public class SquareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner scan =new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Enter a number:");
			num=scan.nextInt();
			
			if(num>=0)
			{
				System.out.println("Square="+(num*num));
			}
		}while(num>0);
	}

}
