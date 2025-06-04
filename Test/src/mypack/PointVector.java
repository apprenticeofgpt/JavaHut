package mypack;

import java.util.Vector;

class MyPoint {
	private int x, y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

public class PointVector {
	public static void main(String[] args) {
		Vector<MyPoint> vp = new Vector<MyPoint>();

		for (int i = 0; i < 10; ++i) {
			vp.add(new MyPoint(i, i + 1));
		}
		vp.remove(1);
		for (int i = 0; i < vp.size(); ++i) {
			MyPoint p = vp.get(i);
			System.out.println(p);
		}
	}
}
