package logical;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		String s1;
		String s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		s1= sc.nextLine();
		System.out.println("Enter the second string");
		s2= sc.nextLine();
		String og1 = s1.replaceAll("\s", "");
		String og2 = s2.replaceAll("\s", "");
		char [] charOg1 = og1.toLowerCase().toCharArray();
		char [] charOg2 = og2.toLowerCase().toCharArray();
		if(charOg1.length != charOg2.length) {
			System.out.println("The two strings are not anagram");
		}else {
			Arrays.sort(charOg1);
			Arrays.sort(charOg2);
			if(Arrays.equals(charOg1, charOg2)) {
				System.out.println("The two strings are anagram");
			}else {
				System.out.println("The two strings are not anagram");
			}
		}
	}

}
