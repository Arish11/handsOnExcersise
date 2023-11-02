package maths.oop.ex2;

public class Rectangle extends Shape {
	double length;
	double breadth;
	
	public Rectangle(double len, double bre) {
		this.length = len;
		this.breadth = bre;
	}
	
	@Override
	public double getArea() {	
		return length*breadth;
	}
}
