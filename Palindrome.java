package javapractise;

import java.util.Scanner;

public class Palindrome {
	//method for number
	
	static boolean isPalindrome(int n)
	{
		int temp=n,rev=0;
		while(n>0)
		{
			int d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		return rev==temp;
	}
	
	//method for string
	
	static boolean isPalindrome(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev.equals(s);
	}

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		//number
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		
		if(isPalindrome(num))
		{
			System.out.println(num+" is Plaindrome");
		}
		else
		{
			System.out.println(num+" is not Plaindrome");
		}
		
		scan.nextLine();//to consume newline
		
		//String
		
		System.out.println("Enter a word:"); 
		String str=scan.nextLine();
		
		if(isPalindrome(str))
		{
			System.out.println(str+" is Plaindrome");
		}
		else
		{
			System.out.println(str+" is not Plaindrome");
		}
		scan.close();
	}

}
