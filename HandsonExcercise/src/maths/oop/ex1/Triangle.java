package maths.oop.ex1;

public class Triangle extends Shape{
	double area;
	double perimeter;
	double semiperimeter;
	double side1 ;
	double side2 ;
	double side3 ;
	
	public Triangle(double s1,double s2,double s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	//Use Herons formula to calculate area

	@Override
	public double calculateArea() {
		semiperimeter = (side1 + side2 + side3)/2;
		area = Math.sqrt(semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3));
		return area ;
	}

	@Override
	public double calculatePerimeter() {
		perimeter = side1 + side2+ side3 ;
		return perimeter ;	
	}

}
