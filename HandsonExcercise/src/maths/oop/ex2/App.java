package maths.oop.ex2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		double len;
		double bre;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle");
		len = sc.nextDouble();
		bre = sc.nextDouble();
		Rectangle rec = new Rectangle(len, bre);
		System.out.println("The area of rectangle is "+rec.getArea());
		sc.close();
	}

}
