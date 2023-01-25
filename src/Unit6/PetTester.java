package Unit6;

public class PetTester {

	public static void main(String[] args) {
		Pet a = new Pet();
		Pet b = new Pet("Perro", 3, 5);
		Pet c = new Pet("Tortuga");
		Pet d = new Pet(5);
		Pet e = new Pet(6.7);
		
		System.out.println(a.getName());
		System.out.println(b.getName());
		System.out.println(b.getAge());
		System.out.println(b.getWeight());
		System.out.println(b.toString());
		System.out.println(c.getName());
		System.out.println(d.getAge());
		System.out.println(e.getWeight());
		
		a.set("Gato", 1, 2);
		b.setName("Conejo");
		b.setAge(5);
		b.setWeight(6);
		
		System.out.println(a);
		System.out.println(b);

	}

}
