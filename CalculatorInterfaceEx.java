package OOPSpractise;

interface Calculator1 {
    int add(int a, int b);
    int sub(int a, int b);
    int multiply(int a, int b);
    double divide(int a, int b);
}

class BasicCal implements Calculator1 {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) a / b;
    }
}

public class CalculatorInterfaceEx {
    public static void main(String[] args) {
        Calculator1 c1 = new BasicCal(); 

        System.out.println("Addition: " + c1.add(10, 20));
        System.out.println("Subtraction: " + c1.sub(20, 10));
        System.out.println("Multiply: " + c1.multiply(100, 20));
        System.out.println("Division: " + c1.divide(1000, 22));
    }
}

//Write an interface Calculator with methods for add, subtract, multiply, and divide. 
//Implement it in a class BasicCalculator