package inClassSep15;

public class Driver {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.setName("Gibbs");
		dog1.setBreed("Dachshund");
		dog1.setAge(2);
		
		Dog dog2 = new Dog("Ava","Golden Retriever",3);
		Dog dog3 = new Dog("Bella","Yorkie",2);
		dog1.show();
		dog2.show();
		dog3.show();
		Dog.showNoDogs();
		
		Dog[] dogs = new Dog[3];
		dogs[0]=dog1;
		dogs[1]=dog2;
		dogs[2]=dog3;
		
		int index;
		for(index=0;index<dogs.length;index++) {
			dogs[index].show();
			System.out.printf("----------------\n");
		}
		
	}

}
