/**
 * 
 */
package com.smoothstack.daytwo.assignmentthree;

import java.text.DecimalFormat;

/**
 * @author Tsemaye
 *
 */
public class Triangle implements Shape {
	
	Double s1;
	Double s2;
	Double s3;
	
	/**
	 * created to play with throws keyword
	 */
	Triangle () {}
	
	Triangle (double s1, double s2, double s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	@Override
	public double calculateArea() throws NullPointerException {
		DecimalFormat df = new DecimalFormat("#.###");
		
		//semi perimeter for Heron's formula
		Double s = (s1 + s2 + s3)/2;
		
		//Uses Heron's formula to calculate area.
		return Double.parseDouble(df.format(Math.sqrt(s*(s - s1)*(s - s2)*(s - s3))));
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "Triangle";
	}

}
