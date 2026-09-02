import java.util.Random;

public class Prog {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		int num=10;
		int start=1;
		int loc;
		
		loadArray(numbers,num,start);
		showArray(numbers);
		
		loc=linearSearch(numbers,16);
		System.out.printf("The locations is %d\n", loc);
		

	}
	
	public static int linearSearch(int[] theArray, int value) {
		int location=-1;
		int index;
		
		for(index=0;index<theArray.length;index++) {
			if(theArray[index]==value) {
				location=index;
				break;
			}
		}		
		return location;
	}
	
	public static void showArray(int[] theArray) {
		int index;
		
		for(index=0;index<theArray.length;index++) {
			System.out.printf("[%d]: %d\n", index,theArray[index]);
		}
	}
	
	public static void loadArray(int[] theArray,int num, int start) {
		int index;
		Random random = new Random();
		
		for(index=0;index<theArray.length;index++) {
			theArray[index] = random.nextInt(num) + start;
		}
	}

}
