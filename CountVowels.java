package javapractise;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		
		//Input a string from user
		System.out.println("Enter a String:");
		String str=scan.nextLine();
		
		//Conver to Lowercase (so 'A' and 'a' are same)
		str=str.toLowerCase();
		
		int count=0;// varaiable to store vowel count
		
		//Go through each character one by one
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);//pick charcter
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				count++;//increment count		
				}
			
		}
		System.out.println("Number of Vowels:"+count);
		
	}

}
