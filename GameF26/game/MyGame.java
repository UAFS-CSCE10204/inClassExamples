package game;

import java.awt.Color;
import java.awt.Graphics;

public class MyGame extends Game{
	Ball ball;
	Ship ship;

	public MyGame(String title, int width, int height) {
		super(title,width,height);
	}
	
	@Override
	public void init() {
		ball = new Ball(150,150,2,60,Color.red);
		ship = new Ship(400,500,2);
		this.addKeyListener(ship);
	}

	@Override
	public void update() {
		ball.update();
		ship.update();
	}

	@Override
	public void render(Graphics g) {
		ball.render(g);
		ship.render(g);
	}
	
	public static void main(String[] args) {
		MyGame game = new MyGame("My Game",800,640);
	}

}
