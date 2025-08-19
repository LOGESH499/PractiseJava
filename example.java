package firstproject;

import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	int x,y,sum;
	Scanner obj=new Scanner(System.in);
     System.out.println("Enter the first number(x)");
     x=obj.nextInt();
     System.out.println("Enter the first number(y)");
     y=obj.nextInt();
     sum=x+y;
     System.out.println("Sum is"+sum);
     
     String str1,str2,str3;
     System.out.println("Enter the first string(str1)");
     str1=obj.nextLine();
     System.out.println("Enter the second string(str2)");
     str2=obj.nextLine();
     
      str3=str1+str2;
     
     System.out.println("The concatenated string is "+str3);
     obj.close();//scanner ends
	}

}
