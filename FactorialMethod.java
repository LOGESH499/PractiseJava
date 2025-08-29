package javapractise;

import java.util.Scanner;

public class FactorialMethod {
	//method to calculate factorial
	
	static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;//multiply one by one
		}
		return fact;//return result
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		
		int result=factorial(num);
		System.out.println("Factorial of "+num+"="+result);

	}

}
