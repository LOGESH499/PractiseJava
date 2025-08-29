package javapractise;

import java.util.Scanner;

public class Divisibleby12 {

	//method with parameter
	static void checkDivisible(int num) {
		if(num%12==0)
		{
			System.out.println(num +" is Divisible by 12");
		}
		else
		{
			System.out.println(num +" is not Divisible by 12");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=scan.nextInt();
		
		//call the method
		checkDivisible(number);
	}

}
