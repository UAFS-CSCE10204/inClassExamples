package inClassSep16;

public class Driver {

	public static void main(String[] args) {
		Dog.showCount();
		
		Dog dog1 = new Dog();
		dog1.setName("Gibbs");
		dog1.setBreed("Dachshund");
		dog1.setAge(2);
		
		Dog dog2 = new Dog("Mosby","Mixed",4);
	
		Dog dog3=dog2;
		dog3.setName("Clifford");
		dog1=dog2;
		dog1.show();
		dog2.show();
		dog3.show();
		
		Dog.showCount();

	}

}
