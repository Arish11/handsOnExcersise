package maths.oop.ex1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		double s1,s2,s3,r ;
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to calculate for circle or for triangle?\n Choose any one\n 1 - Circle \n 2 - Triangle");
		input = sc.nextInt();
		if(input == 1) {
			System.out.println("Enter the radius of circle");
			r = sc.nextDouble();	
			Circle c = new Circle(r);
			System.out.println("The area of circle is " + c.calculateArea());
			System.out.println("The perimeter of circle is " + c.calculatePerimeter());
		}else if (input == 2) {
			System.out.println("Enter three sides of triangle");
			s1 = sc.nextDouble();
			s2 = sc.nextDouble();
			s3 = sc.nextDouble();
			Triangle t = new Triangle(s1, s2, s3);
			System.out.println("The area of triangle is " + t.calculateArea());
			System.out.println("The perimeter of triangle is " + t.calculatePerimeter());
		}else {
			System.out.println("Please enter valid input!");
		}	
		
	}

}
