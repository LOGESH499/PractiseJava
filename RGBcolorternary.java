package javapractise;

import java.util.Scanner;

public class RGBcolorternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter color code(R/G/B):");
		char ch=scan.next().charAt(0);
		
		String color=(ch=='R' || ch=='r')?"Red":
			         (ch=='G' || ch=='g')?"Green":
		             (ch=='B' || ch=='b')?"Blue":"Invalid color";
		
		System.out.println("Color is:"+color);
	}

}
//Using ternary operator print the RGB color based on the input