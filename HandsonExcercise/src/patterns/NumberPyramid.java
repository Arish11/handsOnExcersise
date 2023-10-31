package patterns;

import java.util.Scanner;

public class NumberPyramid {

	public static void main(String[] args) {
		System.out.println("Please enter the number of your choice");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num>0) {
			for(int i = 1;i<=num;i++) {
				System.out.print(i);
			}
			System.out.println();
			num--;
		}
		sc.close();

	}

}
