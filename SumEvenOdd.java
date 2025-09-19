package TaskArray;

import java.util.Scanner;

public class SumEvenOdd {
		
		//method to calculate sum of even and odd numbers
		public static void findSum(int[] arr) {
			int evenSum=0,oddSum=0;
			
			for(int num:arr) {
				if(num%2==0) {
					evenSum +=num;
				}
				else {
					oddSum +=num;
				}
			}
			System.out.println("Sum of Even Numbers="+evenSum);
			System.out.println("Sum of odd Numbers="+oddSum);
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			//input size
			System.out.println("Enter size of array(max 15):");
			int n=scan.nextInt();
			
			//check valid size
			if(n>15) {
				System.out.println("Please enter size less than or equal to 15");
				return;
			}
			int arr[] = new int[n];
			
			//input array elements
			System.out.println("Enter"+n+"elements between 1 to 15:");
			for(int i=0;i<n;i++) {
				arr[i]=scan.nextInt();
			}
			//call method
			findSum(arr);
	}

}
//write a program to find the sum of even or odd elemnt in a arry between 1 to 15
