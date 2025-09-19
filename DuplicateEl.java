package TaskArray;

import java.util.Scanner;

public class DuplicateEl {

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
		
		System.out.println("Duplicate elements are:");
		
		boolean found=false;
		
		//compare each element with others
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					found=true;
					break;//avoid printing same duplicate multiple times
				}
			}
		}
		if(!found) {
			System.out.println("No duplicates found"); 
		}
		scan.close();
	}

}
