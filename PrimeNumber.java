package javapractise;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number (2-20):");
		int num=sc.nextInt();
		
		if(num<=1)
		{
			System.out.println("it is not prime :"+num);
			
		}
		else
		{
			if(num==2 || num==3 || num==5 || num==7 ||
				num==11 || num==13 || num==17 || num==19){
			System.out.println("it is prime"+num);	
			}
			else {
				System.out.println("It is not prime :"+num);
			}
		}
	}

}
