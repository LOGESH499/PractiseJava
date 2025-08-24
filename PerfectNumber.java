package javapractise;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//input Number
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		
		int sum=0;//to store sum of divisors
		
		//Find dividors from 1 to num/2
				for(int i=1;i<=num/2;i++)
				{
					if(num%i==0) {// if i is divisor
						
						sum+=i;//add to sum
						}
					}
		
		//check if sum==number
		
		if(sum==num) {
			System.out.println("This is a perfect number:"+num);
		}
		else {
			System.out.println("This is not a perfect number:"+num);
		}
		
	}

}
