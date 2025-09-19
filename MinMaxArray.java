package TaskArray;

import java.util.Scanner;

public class MinMaxArray {

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
	      
	    //assume first element as min and max
	      int min=arr[0];
	      int max=arr[0];
	      
	      //traverse array to find min and max
	      for(int i=1;i<size;i++) {
	    	  if(arr[i]<min) {
	    		  min=arr[i];//new minimum found
	    	  }
	    	  if(arr[i]>max) {
	    		  max=arr[i];//new maximum found
	    	  }
	      }
	      //print results
	      System.out.println("Minimum value in array:"+min); 
	      System.out.println("Maximum value in array:"+max); 
	      
	      scan.close();
}
}

//write an array to find the min and maximum value in the arry