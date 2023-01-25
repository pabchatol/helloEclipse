package Unit6;
public class FractionTester {
	public static void main(String[] args) {
		Fraction a = new Fraction(125,20);
		Fraction b = new Fraction(3.5);
		Fraction c = new Fraction(4.1);
		Fraction d = new Fraction(2.4);
		System.out.println("Getters: ");
		System.out.println(a.getNum());
		System.out.println(a.getDen());
		System.out.println("Setters: ");
		a.setNum(450);
		a.setDen(125);
		System.out.println("To String method: ");
		System.out.println(a.toString());
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("Simplify method: ");
		System.out.println(a.simplify());
		System.out.println("Addition method: ");
		System.out.println(c.add(d));
		System.out.println("Subtraction method: ");
		System.out.println(c.sub(d));
		System.out.println("Multiplication method: ");
		System.out.println(c.mul(d));
		System.out.println("Division method: ");
		System.out.println(c.div(d));
	}

}
