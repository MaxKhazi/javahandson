package arithmeticcal;
import java.io.*;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	AO aa = new AO();
	System.out.println("**********************Arithmetic Calculator****************************");
	double result=0;
	System.out.println("Enter first value");
	double a = sc.nextDouble();
	System.out.println("Enter second value");
	double b = sc.nextDouble();
	System.out.println("Select any operation: ");
	System.out.println(" 1. Addtion\n 2.Subtraction\n 3.Division\n 4.Multiplication\n");
	int o = sc.nextInt();
	switch(o){
		case 1 : 
			result=aa.ad(a,b);
			System.out.println("Addition of 2 numbers "+result);
			break;
		case 2 : 
			result =aa.su(a,b);
			System.out.println("Subtraction of 2 numbers "+result);
			break;	
		case 3 : 
			result =aa.di(a,b);
			System.out.println("Division of 2 numbers "+result);
			break;
		case 4 : 
			result =aa.mul(a,b);
			System.out.println("Multiplication of 2 numbers "+result);
			break;	
		default:
			System.out.println("Invalid input.... Enter values again");
			main(null);
			
			
	}
	System.out.println("Do you want to re-use the calculator? If yes click 1 or any other number to exit");
	int q = sc.nextInt();
	if(q==1) {
		main(null);
	}
	else {
		System.out.println("Thank you for using the calculator :)");
		System.out.println("************************************************");
		System.exit(0);
	}

	}

}
class AO{
	public double ad(double a, double b) {
		return a+b;
	}
	public double su(double a, double b) {
		return a-b;
	}
	public double mul(double a, double b) {
		return a*b;
	}
	public double di(double a, double b) {
		return a/b;
	}
	
}
