package OOPSpractise;

class Calculator{
	//method to add
	int add(int a,int b) {
		return a+b;
	}
	
	
	//method to sub
		int sub(int a,int b) {
			return a-b;
		}
		
		//method to multiply
		int multiply(int a,int b) {
			return a*b;
		}
		
		//method to division
		int div(int a,int b) {
			return a/b;//assumes b!=0
		}
}

public class CalculatorEx {

	public static void main(String[] args) {
		
		Calculator c1=new Calculator();
		
		System.out.println("Addition: "+c1.add(10, 5));
		System.out.println("Subtraction: "+c1.sub(20, 10));
		System.out.println("Multiply: "+c1.multiply(2, 17));
		System.out.println("Division: "+c1.div(40, 4));

		
	}

}

//Write a program to create a class Calculator
//with methods: add(int a, int b) subtract(int a, int b) multiply(int a, int b) divide(int a, int b)
//All using only class and obj
