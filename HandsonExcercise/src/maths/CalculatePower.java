package maths;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		int num,pow;
		double result;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number\n");
		num = sc.nextInt();
		System.out.println("Enter the power\n");
		pow = sc.nextInt();
		result = calPower(num, pow);
		System.out.println("The power of number is "+result);
	}
	
	public static double calPower(double n, double p){
		return Math.pow(n, p);
	}

}
