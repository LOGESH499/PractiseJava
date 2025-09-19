package TaskArray;

import java.util.Scanner;

public class LargestEl {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//read size of array
		System.out.println("Enter array size:");
		int n=scan.nextInt();
		
		int[] arr=new int[n];
		
		//read array element
		System.out.println("Enter "+n +"element:");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		
		//assume first element is largest
		int largest=arr[0];
		
		//compare with other elements
		for(int i=1;i<n;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println("Largest element="+largest);
		scan.close();
			
	}

}
//writa a program find largest element in the array