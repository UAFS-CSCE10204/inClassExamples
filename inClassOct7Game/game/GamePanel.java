package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Dimension dim;
	Timer timer;
	Circle circle;
	
	public GamePanel(Dimension dim) {
		this.dim=dim;
		this.setBackground(Color.black);
		this.timer = new Timer(20,this);
		circle = new Circle("Circle1",100,100,2,1,Color.red,50);
	}
	
	public void update() {
		circle.update();
	}
	
	public void render(Graphics g) {
		circle.render(g);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.render(g);;
		Toolkit.getDefaultToolkit().sync();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.update();
		this.repaint();
	}

}
