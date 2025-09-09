package Array;

public class Sumevenodd {

	public static void main(String[] args) {
		
		int[] arr= {10,15,20,25};
		int evenSum=0;
		int oddSum=0;
		
		for(int num:arr) {
			if(num%2==0) {
				evenSum +=num;//add to even sum
			}
			else {
				oddSum +=num;//add to odd sum
			}
		}

		System.out.println("Even sum="+evenSum);
		System.out.println("Odd sum="+oddSum);
	}

}
//Take an integer array and calculate the sum of even and odd elements separately. Input: [10, 15, 20, 25] 
//Output: Even Sum = 30, Odd Sum = 40