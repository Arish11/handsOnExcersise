package patterns;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		System.out.println("Please enter the number of your choice");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num>0) {
			int i = 0;
			for(i=num;i>0;i--) {
				System.out.print(i);
			}
			System.out.println();
			num--;
		}
		sc.close();
	}
}
