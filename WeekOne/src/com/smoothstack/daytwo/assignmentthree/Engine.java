/**
 * 
 */
package com.smoothstack.daytwo.assignmentthree;

/**
 * @author Tsemaye
 *
 */

import com.smoothstack.daytwo.assignmentthree.*;

public class Engine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Circle c = new Circle(4);
			System.out.println(c.shapeToString());
			
			Rectangle r = new Rectangle(4, 5);
			System.out.println(r.shapeToString());
			
			Triangle t = new Triangle(3, 5, 7);
			System.out.println(t.shapeToString());
			
			Circle d = new Circle();
			System.out.println(d.shapeToString());
			
		} catch (Exception e) {
			System.out.println("A shape object created is empty");
		}
		
		System.exit(0);
		
	}

}
