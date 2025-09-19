package TaskArray;

import java.util.Scanner;

public class PrintArrayIndex {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		//input size of the array
		System.out.println("Enter the number of elements:");
		int size=scan.nextInt();
		
		int[] arr= new int[size];
		
		//input array elements
		System.out.println("Enter"+size+"elements");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		
		//print array elements with index
		System.out.println("Array elements based on index:");
		for(int i=0;i<size;i++) {
			System.out.println("Index"+i+"->"+arr[i]);
			
		}
		scan.close();

	}

}
//write a program to print the array element based on the array index
