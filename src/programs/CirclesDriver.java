package programs;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/** 
 * ACS-1903 Assignment 3 Question 1
 * @author (your name and student number here)
*/

public class CirclesDriver{
	public static void main(String[] args) {
		// ** Variables constants and objects **

		Scanner scanner = new Scanner(System.in);

		List<Circle> circles = new ArrayList<Circle>();

		for(int i=0; i<10; i++) {
			Random r = new Random();
			Double random = (double) (2 + r.nextFloat() * (5 - 2));
			circles.add(new Circle(0,random));



		}
		System.out.println("Circles list is:\nCircle\tRadius\tArea\tDiam\tCirc");
		for (Circle c: circles) System.out.println(c);



		// ** load the array list with circles **


		// print the whole list


		System.out.println("--------------------------------\n");

		// ** Make sure your Circle class and ArrayList work with the following driver code **
		System.out.println();

		Circle c1 = new Circle();
		System.out.println("C1: " + c1.getID());
		System.out.println("Radius: " + c1.getRadius());
		System.out.println("--------------------------------\n");

		c1.setRadius(1.5);
		System.out.println("C1: " + c1.getID());
		System.out.println("Radius: " + c1.getRadius());
		System.out.println("Area: " + c1.getArea());
		System.out.println("--------------------------------\n");

		circles.get(3).setRadius(2.2);
		System.out.println("C1: " + circles.get(3).getID());
		System.out.println("Radius: " + circles.get(3).getRadius());
		System.out.println("Diameter: " + circles.get(3).getDiameter());
		System.out.println("--------------------------------\n");

		Circle c2 = circles.remove(9);
		System.out.println("C2: " + c2.getID());
		System.out.println("Radius: " + c2.getRadius());
		System.out.println("Circumference: " + c2.getCircumference());
		System.out.println("--------------------------------\n");

		// ** output

		// ** closing message **
		System.out.println("\nend of program");
	}
}
