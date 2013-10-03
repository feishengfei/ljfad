package listing3_1;

import java.util.HashMap;
import java.util.Map;

public class Point extends Shape{
	private int x, y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point)) {
			return false;
		}
		Point p = (Point)o;
		return p.x == x && p.y == y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	void draw() {
		System.out.println("Point drawn at " + toString());
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(20, 30);
		Point p3 = new Point(10, 20);
		//Test reflexivity
		System.out.println(p1.equals(p1));
		//Test symmetry
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p1));
		//Test transitivity
		System.out.println(p2.equals(p3));
		System.out.println(p1.equals(p3));
		//Test nullability
		System.out.println(p1.equals(null));
		//Extra test to further prove the instanceof operator's usefullness.
		System.out.println(p1.equals("abc"));
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		Map<Point, String> map = new HashMap<Point, String>();
		map.put(p1, "first point");
		System.out.println(map.get(p1));//Output: first point
		System.out.println(map.get(new Point(10, 20)));//Output: null
	}
	
}
