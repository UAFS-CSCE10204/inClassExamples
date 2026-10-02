package inheritance;

import java.awt.Color;
import java.util.Random;

public class Shape {
	Color color;
	int x;
	int y;
	
	public Shape() {
		System.out.println("Shape Default Constructor");
	}
	
	public Shape(int x, int y) {
		System.out.println("Shape Arguments Constructor");
		Random rand = new Random();
		this.x=x;
		this.y=y;
		color = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
	}
	
	public void show() {
		System.out.printf("(%d,%d)\n",this.x,this.y);
	}
}
