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
		checkAutomorphic(ogNum,sqNum);
		sc.close();

	}
	
	public static boolean checkAutomorphic(String number, String squareNum) {
		
		return false;
	}

}
