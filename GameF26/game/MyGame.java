package game;

import java.awt.Color;
import java.awt.Graphics;

public class MyGame extends Game {
	private static final long serialVersionUID = -7523847267503799375L;
	GameObject[] balls;
	Ship ship;

	public MyGame(String title, int width, int height) {
		super(title,width,height);
	}

	@Override
	public void init() {
		this.balls = new GameObject[10];
		int index;
		
		this.balls[0] = new Ball(150,150,2,60,Color.red);
		this.balls[1] = new Ball(450,450,3,60,Color.blue);
		for(index=2;index<this.balls.length;index++) {
			this.balls[index] = new RandomBall(this.dim.width,this.dim.height);
		}
		ship = new Ship(400,500,2);
		this.addKeyListener(ship);
		
	}

	@Override
	public void update() {
		int index;
		
		for(index=0;index<this.balls.length;index++) {
			this.balls[index].update();
		}
		ship.update();
	}

	@Override
	public void render(Graphics g) {
		int index;
		
		for(index=0;index<this.balls.length;index++) {
			this.balls[index].render(g);
		}
		ship.render(g);
	}
	
	public static void main(String[] args) {
		MyGame game = new MyGame("My Game",800,640);
	}

}
