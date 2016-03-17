package com.simulator;

public class Point {
	protected int x;
	protected int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point addPoint(Point p) {
		int newPointX = this.x + p.x;
		int newPointY = this.y + p.y;

		return new Point(newPointX, newPointY);
	}

	@Override
	public String toString() {
		return "[" + this.x + ", " + this.y + "]";
	}
}
