package game;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends GameObject {
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public Circle() {
		this.setSize(0);
	}
	
	public Circle(String id, int x, int y, int speed, int direction, Color color, int size) {
		super(id,x,y,speed,direction,color);
		this.setSize(size);
	}
	
	public void update() {
		
	}
	
	public void render(Graphics g) {
		
	}
}
