package TaskArray;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		//input array size
		System.out.println("Enter the size of the array:");
		int size=scan.nextInt();
		
		int[] arr=new int[size];
		
		//input array elements
		System.out.println("Enter"+size+"Elemets:");
		  for(int i=0;i<size;i++) {
			  arr[i]=scan.nextInt();
			  
		  }
		  //print original array
		  System.out.println("Original array:");
		  for(int i=0;i<size;i++) {
			  System.out.println(arr[i]+" ");
		  }
		  
		  //reverse array logic
		  int start=0, end=size-1;
		  while(start<end) {
			  int temp=arr[start];
			  arr[start]=arr[end];
			  arr[end]=temp;
			  start++;
			  end--;
		  }
		  
		  //print reversed array
		  System.out.println("\n Reversed array:");
		  for(int i=0;i<size;i++) {
			  System.out.println(arr[i]+"");
		  }

		  scan.close();
	}

}
//write a program integer reverse in the array
