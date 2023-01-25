package Task14;

import java.util.ArrayList;

import java.util.Scanner;

import Unit6.Point;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner k = new Scanner (System.in);
		int length=5;
		ArrayList<Point> pointslist = new ArrayList<>(length);
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		Point p4 = new Point();
		Point p5 = new Point();
		pointslist.add(p1);
		pointslist.add(p2);
		pointslist.add(p3);
		pointslist.add(p4);
		pointslist.add(p5);
		
		for (int i = 0; i < (length); i++) {
			System.out.println("Define the x value for point p"+(i+1));
			double x = k.nextDouble();k.nextLine();
			pointslist.get(i).setX(x);
			System.out.println("Define the y value for point p"+(i+1));
			double y = k.nextDouble();k.nextLine();
			pointslist.get(i).setY(y);
			System.out.println(pointslist.get(i)+"\t");
		}
		System.out.println("Complete list of points:");
		
		for (int i = 0; i < pointslist.size(); i++) 
			System.out.print(pointslist.get(i)+"\t");
		
		System.out.println("\nLast element removed from the list:");
		pointslist.remove(pointslist.size()-1);
		for (int i = 0; i < pointslist.size(); i++) 
			System.out.print(pointslist.get(i)+"\t");
	}

}
