package maths.oop.ex1;

public class Circle extends Shape {
	Double area;
	Double perimeter;
	Double radius;
	
	

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		area = Math.PI*(radius * radius);
		return area ;
	}

	@Override
	public double calculatePerimeter() {
		perimeter = 2*Math.PI*radius ;
		return perimeter ;	
	}

}
