/*
 * Author: Sean Behan
 * Description: Geometric object classes that return a triangle and it's properties
 */

package assignment1;

public class assignment1 {
	  public static void main(String[] args) {
	    Triangle triangle = new Triangle(1, 1.5, 1);
	    triangle.setColor("yellow");
	    triangle.setFilled(true);
	    System.out.println(triangle);
	    System.out.println("The area is " + triangle.getArea());
	    System.out.println("The perimeter is "
	      + triangle.getPerimeter());
	    System.out.println(triangle);
	  }
	}