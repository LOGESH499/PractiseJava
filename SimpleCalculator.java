package javapractise;

import java.util.Scanner;

public class SimpleCalculator {
	
	//methods
	
			static int add(int a,int b) {return a+b;}//static we cant create object directly we can call
			static int sub(int a,int b) {return a-b;}//static we cant create object directly we can call
			static int mul(int a,int b) {return a*b;}//static we cant create object directly we can call
			static int div(int a,int b) {return a/b;}//static we cant create object directly we can call
			static int mod(int a,int b) {return a%b;}//static we cant create object directly we can call
			

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int x=scan.nextInt();
		
		System.out.println("Enter operator(+ - * / %):");
		char op=scan.next().charAt(0);
		
		System.out.println("Enter second number:");
		int y=scan.nextInt();
		
		int result=0;
		
		if(op == '+') result=add(x,y);
		else if(op == '-') result=sub(x,y);
		else if(op == '*') result=mul(x,y);
		else if(op == '/') result=div(x,y);
		else if(op == '%') result=mod(x,y);
		else {
			System.out.println("Invalid operator!");
		}
		
		System.out.println("Result ="+result);
		scan.close();
		

	}

}

