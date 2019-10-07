package fr.dauphine.ja.martinboris.shapes;

//import java.util.ArrayList;
import java.util.LinkedList;

public class Line {
	/*private int size;
	private int position = 0;*/
	private LinkedList<Point> tab;
	
	public Line() {
		this.tab= new LinkedList<Point>();
	}
	
	/*public void add (Point p) {
		if (this.position<this.size) {
			this.tab[position]=p;
			this.position++;
		}	
	}*/
	public void add (Point p) {
		tab.add(p);
	}
	
	/*public int pointCapacity() {
		return this.size-this.position;
	}*/
	
	public int nbPoints() {
		//return this.position;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
