package Task14;

import java.util.ArrayList;

public class Exercise4 {

	public static void main(String[] args) {
		//Initializing array list
		ArrayList<String> l = new ArrayList<>(5);
		l.add("Raul");
		l.add("Mario");
		l.add("Natalia");
		l.add("Hugo");
		l.add("Manuel");
		for (int i = 0; i < l.size(); i++) 
			System.out.print(l.get(i)+"\t");
		System.out.println();
		//Adding one element
		l.add(1,"Pablo");
		for (int i = 0; i < l.size(); i++) 
			System.out.print(l.get(i)+"\t");
		System.out.println();
		//Removing one element
		l.remove(3);
		for (int i = 0; i < l.size(); i++) 
			System.out.print(l.get(i)+"\t");
	}

}
