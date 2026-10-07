package game;

import java.awt.Color;

public class GameObject {
	private String id;
	private int x;
	private int y;
	private int speed;
	private int direction;
	private Color color;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public GameObject() {
		this.setX(0);
		this.setY(0);
		this.setSpeed(0);
		this.setDirection(0);
		this.setId(id);
		this.setColor(color.gray);
	}
	
	public GameObject(String id, int x, int y, int speed, int direction, Color color) {
		this.setX(x);
		this.setY(y);
		this.setDirection(direction);
		this.setSpeed(speed);
		this.setId(id);
		this.setColor(color);
	}
	
	public void show() {
		System.out.printf("id: %s\n",this.getId());
		System.out.printf("(%d,%d) - Speed: %d Direction: %d Color: %s\n",
				this.getX(),this.getY(),this.getSpeed(),this.getDirection(),this.getColor().toString());
	}
}
