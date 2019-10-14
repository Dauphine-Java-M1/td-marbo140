package fr.dauphine.ja.martinboris.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyDisplay extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public MyDisplay() {}
	
	public void paintComponent(Graphics g){
	    g.drawLine(0, 0, this.getWidth(), this.getHeight());
	    System.out.println("test");
	  }
	
	public static void main(String []args){
		JFrame frame = new JFrame("Java Avance - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDisplay d = new MyDisplay();
		frame.add(d);
		}

}
