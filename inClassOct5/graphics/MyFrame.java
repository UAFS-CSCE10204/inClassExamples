package graphics;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	String appName;
	Dimension dim;
	
	public MyFrame(String appName) {
		this.setName(appName);
		this.dim = new Dimension(800,600);
		this.setSize(dim);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}
	
	public void run() {
		this.setVisible(true);	
	}
	

}
