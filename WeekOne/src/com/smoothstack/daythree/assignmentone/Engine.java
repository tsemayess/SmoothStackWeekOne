/**
 * 
 */
package com.smoothstack.daythree.assignmentone;

import java.io.File;

/**
 * @author Tsemaye
 *
 */
public class Engine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			if (args.length > 1) {
				throw new Exception();
			}
		
			File d = new File(args[0]);
		
			
			//list everything easy to understand hierarchy
			DirectoryReader reader = new DirectoryReader(d);
			reader.printFormatted();
		}
		
		catch (Exception e) {
			System.out.println("Directory entered could not be found or was not entered properly");
		}
	}
	
	

}
