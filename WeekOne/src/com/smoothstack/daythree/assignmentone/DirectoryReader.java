/**
 * 
 */
package com.smoothstack.daythree.assignmentone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;

/**
 * @author Tsemaye
 *
 */
public class DirectoryReader {
	
	public static void printAll(File root) {
		
		
		for (String s: root.list()) {
			File f = new File(root.getAbsolutePath() + "/" + s);
			
			System.out.println(s);
			
			if (f.isDirectory()) {
				printAll(f);

			}
		}
	}

}
