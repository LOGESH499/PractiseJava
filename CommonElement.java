package TaskArray;

import java.util.Scanner;

public class CommonElement {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		//input first array
        System.out.println("Enter the size of first array:");
		int size1=scan.nextInt();
			
		int[] arr1=new int[size1];
					
		System.out.println("Enter"+size1+"Elemets:");
		  for(int i=0;i<size1;i++) {
	       arr1[i]=scan.nextInt();
		}
		//input first array
		System.out.println("Enter the size of second array:");
		int size2=scan.nextInt();
				
		int[] arr2=new int[size1];
						
		System.out.println("Enter"+size1+"Elemets:");
		for(int i=0;i<size2;i++) {
		 arr2[i]=scan.nextInt();
			}
       //find common elements
		System.out.println("Common elements:");
		boolean found=false;
		for(int i=0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]+" ");
					found=true;
					break;   //avoid dupicate printing
				}
			}
		}
		if(!found) {
			System.out.println("No common elements found");
		}
		scan.close();
	}
}
//write a program to find common value in the array