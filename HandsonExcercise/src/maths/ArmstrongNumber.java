package maths;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check if it is armstrong number");
		int num = sc.nextInt();
		String numString = Integer.toString(num);
		int digits = numString.length();
		int powerSum = 0;
		for(int i=0;i<digits;i++) {
			int digit = Character.getNumericValue(numString.charAt(i));
			powerSum += Math.pow(digit, digits);
		}
		if(powerSum == num) {
			System.out.println("This is an armstrong number");
		}else{
			System.out.println("This is not an armstrong number");
		}
	}

}
