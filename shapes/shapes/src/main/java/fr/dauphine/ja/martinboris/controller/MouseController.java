package fr.dauphine.ja.martinboris.controller;

import java.awt.*;  
import java.awt.event.*;

import fr.dauphine.ja.martinboris.shapes.*;
import fr.dauphine.ja.martinboris.shapes.Point;
import fr.dauphine.ja.martinboris.shapes.Shape;
import fr.dauphine.ja.martinboris.view.MyDisplay;  

public class MouseController extends Frame implements MouseMotionListener{  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyDisplay d;
	public MouseController(MyDisplay d){  
        this.d = d;
    }  
 
	public void mouseMoved(MouseEvent e) {
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		fr.dauphine.ja.martinboris.shapes.Point p = new Point(e.getX(),e.getY());
		for (Shape s : this.d.w.shapes) {
			if (s.contains(p)) {
				Circle c = (Circle) s;
				c.getCenter().translate(p.getX(), p.getY());
				System.out.println("ok");
			}
		}
	}  
}
