package Task14;
import java.util.Scanner;
public class IntWrapper {

	public static void main(String[] args) {
		Scanner k =new Scanner (System.in);
		String a;
		String b;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println("Enter two decimal integers");
		a=k.next();
		b=k.next();
		System.out.println("Sum of the two integers: "+(Integer.parseInt(a)+Integer.parseInt(b)));
		
	}

}
