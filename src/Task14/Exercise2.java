package Task14;

public class Exercise2 {

	public static void main(String[] args) {
		Double a=8.3;
		Double b=2.2;
		
		if (a.compareTo(b)>0)
			System.out.println("The first one is greater than the second one");
		else if(a.compareTo(b)==0)
			System.out.println("The first one is equal to the second one");
		else
			System.out.println("The second one is greater than the first one");
	}

}
