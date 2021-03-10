/**
 * 
 */
package com.smoothstack.daytwo.assignmentthree;

import java.text.DecimalFormat;

/**
 * @author Tsemaye
 *
 */
public class Rectangle implements Shape {
	private Double width;
	private Double length;
	
	/**
	 * created to play with throws keyword
	 */
	Rectangle () {}
	
	Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double calculateArea () throws NullPointerException  {
		DecimalFormat df = new DecimalFormat("#.###");
		return Double.parseDouble(df.format(width * length));
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}

}
