package javapractise;

import java.util.Scanner;

public class CharType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Character:");
		char ch =scan.next().charAt(0);
		
		if(Character.isAlphabetic(ch))
		{
			System.out.println("Alphabet");
		}
		else if(Character.isDigit(ch))
		{
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Charcter");
		}
		
	}

}
