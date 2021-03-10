/**
 * 
 */
package com.smoothstack.daytwo.assignmentthree;

/**
 * @author Tsemaye
 *
 */
public interface Shape {
	
	public double calculateArea();
	
	public String display();
	
	
	default String shapeToString() {
		return this.display() + " area: " + this.calculateArea() + "\n";
	}
 
}
