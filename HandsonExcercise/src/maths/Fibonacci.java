package maths;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int n1= 0, n2 =1;
		int count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of fibonacci elements in the series");
		count = sc.nextInt();
		generateSeries(count, n1,n2);

	}
	public static void generateSeries(int c, int n1, int n2){
		if(c>2) {
			System.out.print("\nThe elements are "+n1+" "+n2);
			for(int i=2; i<c; i++) {
				int n3 = n1+n2;
				System.out.print(" "+n3);
				n1=n2;
				n2=n3;
			}
		}
	}

}
