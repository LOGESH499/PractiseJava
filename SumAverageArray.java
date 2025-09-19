package TaskArray;

import java.util.Scanner;

public class SumAverageArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//input size of the array
		System.out.println("Enter the number of elements:");
		int size=scan.nextInt();
		
		int[] arr= new int[size];
		
		//input array elements
		System.out.println("Enter"+size+"elements");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		
		//calculate sum
		int sum=0;
		
		for(int i=0;i<size;i++) {
			sum +=arr[i];
		}
		//calculate average
		double average=(double)sum/size;   //typecasting
		
		//Display results
		System.out.println("Sum of array elements:"+sum);
		System.out.println("Average of array elements"+average);
		
		scan.close();

	}

}
//write a program to find the sum average of an element in the array