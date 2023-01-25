package Task14;

import java.util.ArrayList;

public class Exercise5 {

	public static void main(String[] args) {
		//First array list
		ArrayList<String> c1 = new ArrayList<>(3);
		c1.add("Red");
		c1.add("Blue");
		c1.add("Green");
		for (int i = 0; i < c1.size(); i++) 
			System.out.print(c1.get(i)+"\t");
		System.out.println();
		
		//Second array list
		ArrayList<String> c2 = new ArrayList<>(3);
		c2.add("Yellow");
		c2.add("Orange");
		c2.add("Purple");
		c2.add("Black");
		for (int i = 0; i < c2.size(); i++) 
			System.out.print(c2.get(i)+"\t");
		System.out.println();
		
		//Third array list addAll
		ArrayList<String> c3 = new ArrayList<>(c1.size()+c2.size());
		c3.addAll(c1);
		c3.addAll(c2);
		for (int i = 0; i < c3.size(); i++) 
			System.out.print(c3.get(i)+"\t");
	}

}
