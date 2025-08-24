package javapractise;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter units Consumed:");
		int units=scan.nextInt();
		double bill=0;
		
		if(units<=100)
		{
			bill=units*1.5;
		}
		else if(units<=200)
		{
			bill=100*1.5+(units-100)*2.5;
		}
		else 
		{
			bill=100*1.5+100*2.5+(units-100)*4;
		}
		System.out.println("Total Bill =₹"+bill);
		
	}

}
