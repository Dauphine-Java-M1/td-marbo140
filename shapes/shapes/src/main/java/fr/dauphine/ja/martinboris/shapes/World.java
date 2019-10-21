package fr.dauphine.ja.martinboris.shapes;

import java.util.ArrayList;

public class World {
	public ArrayList<Shape> shapes;
	
	public World() {
		shapes = new ArrayList<Shape>();
	}
	
	public void addshape(Shape s) {
		shapes.add(s);
	}
	
}
