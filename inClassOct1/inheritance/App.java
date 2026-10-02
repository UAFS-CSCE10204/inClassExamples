package inheritance;

import java.awt.Dimension;

import javax.swing.JFrame;

public class App {
	JFrame frame;
	Dimension dim;
	MyPanel panel;
	
	public App(String name) {
		frame = new JFrame(name);
		dim = new Dimension(800,600);
		frame.setSize(dim);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new MyPanel();
		frame.add(panel);
	}
	
	public void run() {
		frame.setVisible(true);
	}
	
	public static void main(String[] arg) {
		App app = new App("My App");
		app.run();
	}
}
