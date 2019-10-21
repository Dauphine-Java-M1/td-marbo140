package fr.dauphine.ja.martinboris.view;

import java.awt.Graphics;

import fr.dauphine.ja.martinboris.shapes.Circle;

public class CircleDrawer extends Drawer {
	int x;
	int y;
	int rayon;
	public CircleDrawer(Circle c) {
		this.x = c.getCenter().getX();
		this.y = c.getCenter().getY();
		this.rayon = c.getRayon();
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawOval(this.x, this.y, this.rayon, this.rayon);
	}

}
