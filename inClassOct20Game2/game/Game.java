package game;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Game {
	JFrame win;
	Dimension dim;
	GamePanel gamePanel;
	Thread gameLoop;
	
	public Game() {
		win = new JFrame("My Game");
		win.setResizable(false);
		win.setLocationRelativeTo(null);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dim = new Dimension(800,600);
		win.setSize(dim);
		gamePanel = new GamePanel(dim);
		win.add(gamePanel);
	}
	
	public void run() {
		win.setVisible(true);
		gameLoop = new Thread(this.gamePanel);
		gameLoop.start();
	}
	
	public static void main(String[] str) {
		Game game = new Game();
		game.run();
	}
}
