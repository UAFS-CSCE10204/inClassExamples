package game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Balls {
	GameObject[] objects;
	int height;
	int width;
	
	public Balls(int width, int height) {
		Random rnd = new Random();
		this.objects = new GameObject[rnd.nextInt(15)+2];
		this.width=width;
		this.height=height;
	}
	
	public void init() {
		int index;
		
		this.objects[0] = new Player(400,400,2,50,Color.blue);
		this.objects[1]= new Ball(150,150,5,60,Color.red);
		for(index=2;index<this.objects.length;index++){
			this.objects[index] = new RandomBall(this.width,this.height);
		}
		
	}
	
	public void update() {
		int index;
		
		for(index=0;index<this.objects.length;index++){
			this.objects[index].update();
		}
		
	}
	
	public void render(Graphics g) {
		int index;
		
		for(index=0;index<this.objects.length;index++){
			this.objects[index].render(g);
		}
		
	}
}
