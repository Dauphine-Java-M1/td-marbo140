package fr.dauphine.ja.martinboris.shapes;

import fr.dauphine.ja.martinboris.view.Drawer;

public abstract class Shape {
	public Drawer d;
	public abstract boolean contains(Point p);
	/*public Shape(Drawer d) {
		this.d = d;
	}*/
	
}
