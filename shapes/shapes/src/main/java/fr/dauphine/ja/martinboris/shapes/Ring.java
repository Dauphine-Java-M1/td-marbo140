package fr.dauphine.ja.martinboris.shapes;

import java.util.ArrayList;

public class Ring {
	Circle cercle;
	int rayonint;
	
	
	public Ring(Point centre, int rayon, int rayonint) {
		this.cercle = new Circle(centre, rayon);
		this.rayonint = rayonint;
	}

	public boolean equals (Ring r) {
		return (this.cercle.equals(r.cercle))&&(rayonint == r.rayonint);
	}
	
	
	public String toString () {
		return this.cercle.toString() + "rayon intérieur" + this.rayonint;
	}
	
	public boolean contains(Point p) {	
		if (this.cercle.contains(p)) {
			int tmp = this.cercle.rayon;
			this.cercle.rayon = rayonint;
			boolean bool =  !(this.cercle.contains(p));
			this.cercle.rayon = tmp;
			return bool;
		}
		return false;
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
