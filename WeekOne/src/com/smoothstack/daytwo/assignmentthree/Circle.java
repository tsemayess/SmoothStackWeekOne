/**
 * 
 */
package com.smoothstack.daytwo.assignmentthree;

import java.text.DecimalFormat;

/**
 * @author Tsemaye
 *
 */
public class Circle implements Shape {
	private Double radius;
	
	/**
	 * created to play with throws keyword
	 */
	Circle () {}
	
	/**
	 * 
	 * @param radius
	 */
	Circle (double radius) {
		this.radius = radius;
	}
	
	

	/**
	 * 
	 */
	@Override
	public double calculateArea() throws NullPointerException {
		
		DecimalFormat df = new DecimalFormat("#.###");
		return Double.parseDouble(df.format(Math.PI * radius * radius));
	}

	/**
	 * 
	 */
	@Override
	public String display() {
		return "Circle";
	}

}
