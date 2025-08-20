package javapractise;

import java.util.Scanner;


public class StringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter a numeric String");
		String numstr=obj.nextLine();//taking input as string
		
		//Convert to int
		int intValue=Integer.parseInt(numstr);
		System.out.println("Integer value is:"+intValue);
		
		//convert to Long
		long longValue=Long.parseLong(numstr);
		System.out.println("Long value is:"+longValue);
		
		//convert to float
		float floatValue=Float.parseFloat(numstr);
		System.out.println("Float value is"+floatValue);
		
		//convert to double
		double doubleValue=Double.parseDouble(numstr);
		System.out.println("Double value is"+doubleValue);

		
		
	}

}
