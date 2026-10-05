package graphics;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Driver {

	public static void main(String[] args) {
		/*
		JFrame window = new JFrame("My App");
		Dimension dim = new Dimension(800,600);
		window.setSize(dim);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);*/
		
		MyFrame window = new MyFrame("My App");
		window.run();

	}

}
