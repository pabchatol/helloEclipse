package Unit6;

public class StudentTester {

	public static void main(String[] args) {

		Student s = new Student();
		Student s2 = new Student("Louis","Smith", 15);
		
		System.out.println(s.getSurnameAndName());
		System.out.println(s2.getSurnameAndName());
		System.out.println(s2.getName());
		System.out.println(s2.getSurname());
		System.out.println(s2.getAge());
		System.out.println(s2.toString());
		
		s.setName("Pepe");
		s.setSurname("López");
		s.setAge(17);
		
		System.out.println(s.getName());
		System.out.println(s.getSurname());
		System.out.println(s.getAge());



	}

}
