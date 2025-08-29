package javapractise;

enum Grade{
	Excellent,Good,Average,Fail
}

public class EnumRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int avg=85;
		
		Grade grade;
		if(avg>=85) {
			grade=Grade.Excellent;
		}
		else if(avg>=75){
			grade=Grade.Good;
		}
		else if(avg>=50)
		{
			grade=Grade.Average;
		}
		else {
			grade=Grade.Fail;
		}
		System.out.println("Average:"+avg);
		System.out.println("Grade is:"+grade);
	}

}
//Define enum for rank based on the avg define in the grade