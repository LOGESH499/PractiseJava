package javapractise;

import java.util.Scanner;

public class PostiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("positive number"+num);
		}
		else {
			if(num<0) 
			{
				System.out.println("Negative number"+num);
			}
			else
			{
				System.out.println("It is zero");
			}
		}
	}

}
