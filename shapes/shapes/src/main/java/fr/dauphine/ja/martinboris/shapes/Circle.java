package fr.dauphine.ja.martinboris.shapes;

import java.util.ArrayList;

public class Circle {
	private Point centre;
	int rayon;
	

	public Circle(Point p, int r) {
		centre = p;
		rayon = r;
	}
	
	
	public void translate (int dx, int dy) {
		Point p = new Point (dx, dy);
		this.centre.setX(dx);
		this.centre.setY(dy);
	}
	
	public Point getCenter() {
		return this.centre;
	}
	
	public double surface() {
		return this.rayon*this.rayon*Math.PI;
	}
	
	public boolean contains(Point p) {
		return (p.getX()-this.centre.getX())*(p.getX()-this.centre.getX()) + (p.getY()-this.centre.getY())*(p.getY()-this.centre.getY())<= this.rayon*this.rayon;
	}
	
	public boolean contains(Point p, ArrayList<Circle> circles) {
		for (Circle c : circles) {
			if (c.contains(p)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.centre.toString() + " rayon " + this.rayon + " surface " + this.surface();
	}
	
	
	public static void main(String[] args) {
		Circle c=new Circle(new Point(1,2), 1);
		c.getCenter().translate(1,1);
		System.out.println(c);
	}
}
