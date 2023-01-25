package Task14;
import java.util.ArrayList;
import java.util.Random;

public class Exercise6 {

	public static void main(String[] args) {
		// random arraylist
		int length=5;
		Random r = new Random();
		ArrayList<Integer> order = new ArrayList<>(length);
		
		for (int i = 0; i < length; i++) {
			order.add(r.nextInt(11));
			System.out.print(order.get(i)+"\t");
		}
		System.out.println();
		
		//order arraylist
		order.sort(null);
		
		//display ordered arraylist
		for (int i = 0; i < order.size(); i++) 
			System.out.print(order.get(i)+"\t");
	}

}
