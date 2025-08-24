package javapractise;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		
		if(year%400 ==0)
		{
			System.out.println("It is Leap year:"+year);
		}
		else if(year%100==0)
		{
			System.out.println("It is not Leap Year:"+year);
		}
			
		else if(year%4==0)
		{
			System.out.println("It is Leap year:");
		}
		else
		{
			System.out.println("It is not Leap Year:"+year);
		}
			
	}

}
