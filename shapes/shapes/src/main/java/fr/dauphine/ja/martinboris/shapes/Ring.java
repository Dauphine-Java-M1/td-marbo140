package fr.dauphine.ja.martinboris.shapes;

import java.util.ArrayList;

public class Ring extends Circle{
	Point centre;
	int rayon;
	int rayonint;
	
	
	public Ring(Point centre, int rayon, int rayonint) {
		super(centre, rayon);
		this.rayonint = rayonint;
	}

	public boolean equals (Ring r) {
		return ((centre.equals(r.centre))&&(rayon == r.rayon)&&(rayonint == r.rayonint));
	}
	
	
	public String toString () {
		return this.centre.toString() + "rayon " + this.rayon + "rayon intérieur" + this.rayonint;
	}
	
	public boolean contains(Point p) {
		Circle first = new Circle (this.centre, this.rayonint);
		Circle last = new Circle (this.centre, this.rayon);
		return !(first.contains(p))&&(last.contains(p));	
	}
	
	public boolean contains(Point p, ArrayList<Ring> rings) {
		for (Ring r : rings) {
			if (r.contains(p)) {
				return true;
			}
		}
		return false;
				
	}

}
