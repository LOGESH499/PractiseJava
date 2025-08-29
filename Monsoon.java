package javapractise;

import java.util.Scanner;

public class Monsoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a season num:");
		int seasonnum=scan.nextInt();//Summer,Winter,Rainy
		
		String monsoon =(seasonnum==1)?"Summer":
		                (seasonnum==2)?"Winter":
		                (seasonnum==3)?"Rainy":"Unknown Season";
		        
	   System.out.println("Season is:"+monsoon);
		
		

	}

}
//Write a program to print any three monsoon using ternary operator