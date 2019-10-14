package fr.dauphine.ja.martinboris.shapes;

import java.util.LinkedList;

public class Line {
	private LinkedList<Point> tab;
	
	public Line() {
		this.tab= new LinkedList<Point>();
	}

	public void add (Point p) {
		tab.add(p);
	}

	public int nbPoints() {
		return tab.size();
	}
	
	public boolean contains (Point p) {
		for ( Point i : this.tab ) {
			if (i.isSameAs(p)) {
				return true;
			}	
		}
		return false;
	}

}
