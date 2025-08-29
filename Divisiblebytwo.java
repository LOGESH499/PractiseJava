package javapractise;

import java.util.Scanner;

public class Divisiblebytwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=scan.nextInt();
		
		String result=(num%2==0)?"Divisible by 2":"Not Divisible by 2";
		
		System.out.println(result);
	}

}
