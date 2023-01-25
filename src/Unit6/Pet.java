package Unit6;

public class Pet {
	// attributes
		private String Name;
		private int Age;
		private double Weight;
		
	//constructors
		public Pet() {
			
		}
		public Pet(String initialName,int initialAge, double initialWeight) {
			this.Name=initialName;
			this.Age=initialAge;
			this.Weight= initialWeight;
		}
		public Pet(String initialName) {
			Name=initialName;
		}
		public Pet(int initialAge) {
			this.Age=initialAge;
		}
		public Pet(double initialWeight) {
			this.Weight= initialWeight;
		}
		
	//getters
		public String getName() {
			return Name;
		}
		public int getAge() {
			return Age;
		}
		public double getWeight() {
			return Weight;
		}	
	@Override
		public String toString() {
			return "Pet [Name=" + Name + ", Age=" + Age + ", Weight=" + Weight + "]";
		}
	
		//setters
		public void set(String newName,int newAge,double newWeight) {
			this.Name=newName;
			this.Age=newAge;
			this.Weight= newWeight;
		}
		public void setName(String newName) {
			Name = newName;
		}
		public void setAge(int newAge) {
			this.Age = newAge;
		}
		public void setWeight(double newWeight) {
			this.Weight = newWeight;
		}
	
}
