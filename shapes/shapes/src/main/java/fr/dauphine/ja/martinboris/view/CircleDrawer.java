package fr.dauphine.ja.martinboris.view;

import java.awt.Graphics;

import fr.dauphine.ja.martinboris.shapes.Circle;

public class CircleDrawer extends Drawer {
	Circle c;
	public CircleDrawer(Circle c) {
		this.c = c;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawOval(this.c.getCenter().getX(), this.c.getCenter().getY(), this.c.getRayon(), this.c.getRayon());
	}

}
