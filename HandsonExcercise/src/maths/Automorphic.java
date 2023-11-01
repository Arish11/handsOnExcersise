package maths;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		int num = 0;
		int square = 0;
		System.out.println("Please enter the number to test if it is automorphic");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		square = num*num;
		System.out.println("The square of "+num+" is "+square);
		String ogNum = Integer.toString(num);
		String sqNum = Integer.toString(square);
		if(checkAutomorphic(ogNum,sqNum)) {
			System.out.println("Number is an automorphic number");
		}else {
			System.out.println("Number is not an automorphic number");
		}
		sc.close();
	}
	
	public static boolean checkAutomorphic(String number, String squareNum) {
		if(squareNum.endsWith(number)) {
			return true ;
		}else {
			return false;
		}
	}

}
