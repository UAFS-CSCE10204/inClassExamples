package inClassSep16;

public class Dog {
	static int noDogs=0;
	private String name;
	private String breed;
	int age;
	
	public void setName(String name) {
		if(name.equals("")) {
			this.name="Dog";
		}else {
			this.name=name;		
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setBreed(String breed) {
		if(breed.equals("")) {
			this.breed="Mixed";
		}else {
			this.breed=breed;		
		}
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public void setAge(int age) {
		if(age>=1 && age <=20) {
			this.age=age;
		}else {
			this.age=1;
		}
	}
	
	public int getage() {
		return this.age;
	}
	
	public Dog() {
		Dog.noDogs++;
	}
	
	public Dog(String name, String breed, int age) {
		Dog.noDogs++;
		this.setBreed(breed);
		this.setName(name);
		this.setAge(age);
	}
	
	public void show() {
		System.out.printf("Name:  %s\n",this.name);
		System.out.printf("Breed: %s\n",this.breed);
		System.out.printf("Age:   %d\n",this.age);
	}
	
	public static void showCount() {
		System.out.printf("No Dogs: %d\n",Dog.noDogs);
	}
}
