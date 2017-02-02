package assignment1;

class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	// default values

	public Triangle(int i, double d, int j) {
		this.side1 = i;
		this.side2 = d;
		this.side3 = j;
		// constructor
	}
	
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	public double getArea() {
		double area;
		double s;
		s = getPerimeter() / 2;
		area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)); // using Heron's formula
		return Math.floor(area * 100) / 100; // round to 2 decimal places
	}
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}