package Task14;

public class Exercise3 {

	public static void main(String[] args) {
		//Initializing the array
		char []v = new char [5];
		v[0] = 'a';
		v[1] = 'B';
		v[2] = '6';
		v[3] = 'j';
		v[4] = 'K';
		//Converting to upper case
		for (int i = 0; i < v.length; i++) {
			System.out.print((Character.toUpperCase(v[i]))+"\t");
		}
		//Converting to lower case
		System.out.println();
		for (int i = 0; i < v.length; i++) {
			System.out.print((Character.toLowerCase(v[i]))+"\t");
		}
		//Evaluating if the char is a letter or a digit
		System.out.println();
		for (int i = 0; i < v.length; i++) {
			if (Character.isLetter(v[i]))
				System.out.println(v[i]+" is a letter");
			else if(Character.isDigit(v[i]))
				System.out.println(v[i]+" is a digit");
			else
				System.out.println(v[i]+" is neither a digit nor a letter");
		}
	}
}