package Unit6;

public class PointTester {

	public static void main(String[] args) {
		Point p1 = new Point(); // we create point p1
		Point p2 = new Point(3,1); // we create point p2
		Point p3 = new Point(1); // we create point p3
		
		System.out.println("1 ("+p1.getX() + ", "+p1.getY()+")");
		System.out.println("2 " +p2.toString());
		System.out.println("3 "+ p2);
		System.out.println(p3.distOrigin());
		
		p1.setX(3);
		p1.setY(3);
		p2.setXY(1,5);
		
		System.out.println("1 ("+p1.getX() + ", "+p1.getY()+")");
		System.out.println("2 " +p2.toString());
		System.out.println("3 "+ p2);
		}

}
