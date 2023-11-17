package logical;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		String s1;
		StringBuilder s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string/number to check palindrome");
		s1 = sc.nextLine();		
		s2 = new StringBuilder();
		s2.append(s1);
		s2.reverse();
		if(s1.equals(s2.toString())) {
			System.out.println("This is a palindrome");
		}else {
			System.out.println("This is not a palindrome");
		}
		sc.close();
	}
}
