package com.smoothstack.dayfour.assignmentfour;

public class Line {
	private Double x0, x1, y0, y1;
	
	public Line(double x0, double y0, double x1, double y1) {
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;			
	}
	
	public double getSlope() {
		//changed because are doubles
		if (Math.abs(x1 - x0) < 0.000001) {
			throw new ArithmeticException();
		}
		return (y1 - y0)/(x1 - x0);
	}
	
	public double getDistance() {
		return Math.sqrt((x1 - x0)*(x1 - x0) + (y1 - y0) * (y1 - y0));
	}
	
	public boolean parallelTo(Line l) {
		if (Math.abs(getSlope() - l.getSlope()) < .0001) {
			return true;
		} else {
			return false;
		}
	}
}
