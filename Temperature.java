package javapractise;

import java.util.Scanner;

public class Temperature {
	
	//Celsius to Fahrenheit
	
	public static double CelsiusToFahrenheit(double c) {
		return (c*9/5)+32;
	}
	
	//celsius to Kelvin	
	
	public static double CelsiusToKelvin(double c) {
		return c+273.15;
	}
	
	//Fahrenheit to Celsius
	
	public static double fahrenheittocelsius(double f) {
		return (f-32)*5/9;
	}
	
	//Fahrenheit To Kelvin
	
	public static double FahrenheitToKelvin(double f) {
		return (f-32)*5/9+273.15;
	}
	
	//Kelvin To Celsius
	
	public static double KelvinToCelsius(double k) {
		return k-273.15;
	}
	

	//Kelvin To Fahrenheit
	
	public static double KelvinToFahrenheit(double k) {
		return (k-273.15)*9/5+32;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner scan = new Scanner(System.in);
		
		//Input in Celsius
		System.out.println("Enter Celsius :");
		double c =scan.nextDouble();
		System.out.println("Celsius to Fahrenheit ="+CelsiusToFahrenheit(c));
		System.out.println("Celsius to Kelvin ="+CelsiusToKelvin(c));
		
		//Input in Fahrenheit
		System.out.println("EnterFahrenheit :");
		double f =scan.nextDouble();
		System.out.println("Fahrenheit to Celsius ="+fahrenheittocelsius(f));
		System.out.println("Fahrenheit to Kelvin ="+FahrenheitToKelvin(f));
		
		//Input in Kelvin
		System.out.println("Enter Kelvin :");
		double k =scan.nextDouble();
		System.out.println("Kelvin to Celsius ="+KelvinToCelsius(k));
		System.out.println(" Kelvin to Fahrenheit ="+KelvinToFahrenheit(k));
	}

}


//Formulas used:

//C → F = (C × 9/5) + 32

//C → K = C + 273.15

//F → C = (F − 32) × 5/9

//F → K = (F − 32) × 5/9 + 273.15

//K → C = K − 273.15

//K → F = (K − 273.15) × 9/5 + 32






