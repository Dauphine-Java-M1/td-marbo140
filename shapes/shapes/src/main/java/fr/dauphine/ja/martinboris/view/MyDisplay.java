package fr.dauphine.ja.martinboris.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.dauphine.ja.martinboris.controller.MouseController;
import fr.dauphine.ja.martinboris.shapes.Circle;
import fr.dauphine.ja.martinboris.shapes.Point;
import fr.dauphine.ja.martinboris.shapes.Shape;
import fr.dauphine.ja.martinboris.shapes.World;

public class MyDisplay extends JPanel{
	public World w;
	private static final long serialVersionUID = 1L;

	public MyDisplay(World w) {
		this.w = w;
	}
	
	public void paintComponent(Graphics g){
	    //g.drawLine(0, 0, this.getWidth(), this.getHeight());
	    //System.out.println("test");
		for (Shape p : w.shapes) {
			p.d.draw(g);		}
	  }
	
	public static void main(String []args){
		JFrame frame = new JFrame("Java Avance - Graphic Display");
		frame.setSize(new Dimension(500,500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		World w = new World();
		Point p = new Point (0,0);
		Circle c = new Circle (p, 300);
		w.addshape(c);
		MyDisplay d = new MyDisplay(w);
		MouseController e = new MouseController(d);
		
		frame.add(d);
		frame.add(e);
		}

}
