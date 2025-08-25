package javapractise;

public class DivisibleNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//Numbers from 100 t0 50
		
		for(int i=100;i>=50;i--)
		{
			if(i%4==0 && i%2==0)
			{
				System.out.println("It is divisible by 2 and 4:"+i);
			}
			else if(i%4==0)
			{
				System.out.println("It is divisible by 4:"+i);
			}
			else if(i%2==0)
			{
				System.out.println("It is divisible by 2:"+i);
			}
		}
	}

}
