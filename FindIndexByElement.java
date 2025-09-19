package TaskArray;

import java.util.Scanner;

public class FindIndexByElement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Input size of the array
		System.out.println("Enter the number of elements:");
		int size=scan.nextInt();
		
		int[] arr= new int[size];
		
		//input array elements
		System.out.println("Enter"+size+"Elements");
		for(int i=0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		
		//input elements to search
		System.out.println("Enter the element to find index:");
		int element=scan.nextInt();
		
		//find index of given element
		
		boolean found = false;
		for(int i=0;i<size;i++) {
			if(arr[i]==element) {
				System.out.println("Element"+element+"found at index"+i);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Element"+element+"not found in the array");
		}
		scan.close();

	}

}
