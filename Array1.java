package Array;

public class Array1 {

	public static void main(String[] args) {
		
		int[] arr= {1,2,2,3,1,4};
		boolean[] visited=new boolean[arr.length];//to mark counted elements
		
		for(int i=0;i<arr.length;i++) {
			if(visited[i]) {
				continue;//skip already counted element
			}
			
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					visited[j]=true;//mark duplicate as counted
				}
			}
			if(count==1) {
				System.out.println(arr[i]+"→" +count+ "time");
			}
			else {
				System.out.println(arr[i]+"→" +count+ "times");
			}
		}

	}

}
//Given an array of integers, display how many times each element appears.

//   Input: [1, 2, 2, 3, 1, 4]  
//   Output:  
//   1 → 2 times  
//   2 → 2 times  
//   3 → 1 time  
//   4 → 1 time