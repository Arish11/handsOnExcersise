package maths;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int range; 
		List<Integer> primeNumbers = new ArrayList<Integer>();
		System.out.println("Enter the number upto which you want alternate prime numbers");
		Scanner sc = new Scanner(System.in);
		range = sc.nextInt();
		for(int i=1;i<=range;i++) {
			if (checkPrime(i)) {
				primeNumbers.add(i);
			}
		}
		System.out.println("Prime numbers upto "+range+" are "+primeNumbers);
		System.out.println("Alternate prime numbers in the order are");
		printAlternate(primeNumbers);
		sc.close();
		
	}
	
	public static boolean checkPrime(int num) {
		int divCount = 0;
		if (num == 1) {
			return false;
		}
		for (int i = num; i > 0; i--) {
			if (num % i == 0) {
				divCount++;
			}
		}
		if(divCount > 2) {
			return false;
		}else {
			return true ;
		}
	}
	
	public static void printAlternate(List<Integer> primeNumList) {
		int len = primeNumList.size();
		for (int i=0; i<len; i++) {
			if(i%2 == 0) {
				System.out.print(primeNumList.get(i)+", ");
			}
		}
	}

}


















