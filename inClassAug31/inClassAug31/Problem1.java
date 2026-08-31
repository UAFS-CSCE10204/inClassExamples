package inClassAug31;

import java.util.Random;

public class Problem1 {

	public static void main(String[] args) {
		int[] numbers = new int[20];
		
		loadArray(numbers);
		showArray(numbers);

	}
	
	public static void loadArray(int[] theArray) {
		int index;
		
		Random rand = new Random();
		
		for(index=0;index<theArray.length;index++) {
			theArray[index] = rand.nextInt(10);
		}
	}
	
	public static void showArray(int[] theArray) {
		int index;
		
		for(index=0;index<theArray.length;index++) {
			System.out.printf("[%2d]: %2d\n", index,theArray[index]);
		}
	}

}
