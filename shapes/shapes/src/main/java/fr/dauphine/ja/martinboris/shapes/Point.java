package fr.dauphine.ja.martinboris.shapes;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Point 
{
	private int x;
	private int y;
	private static int cpt = 0;
	
	public Point() {
		
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.cpt++;
	}
	
    public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public boolean isSameAs(Point p) {
		return ((this.x==p.x)&&(this.y==p.y));
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public static void main( String[] args )
    {
        /*Point p = new Point(0,0);
        Point r = new Point(0,0);
        System.out.println(p.x+" "+p.y);
        Point q = new Point(0,0);
        System.out.println(cpt);
        System.out.println(q);*/
		
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);

		
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
        
    }
}
