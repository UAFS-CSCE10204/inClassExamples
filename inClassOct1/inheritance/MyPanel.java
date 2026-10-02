package inheritance;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	Dimension dim;
	Circle circle;

	public MyPanel() {
		dim = new Dimension(800,600);
		this.setSize(dim);
		this.setBackground(Color.black);
		circle = new Circle(100,100,50);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.fillOval(100, 100, 50, 50);
	}
}
