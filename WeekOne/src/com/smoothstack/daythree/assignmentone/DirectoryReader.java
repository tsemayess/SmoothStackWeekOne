/**
 * 
 */
package com.smoothstack.daythree.assignmentone;

import java.io.File;
import java.util.List;
import java.util.ArrayList;

/**
 * @author Tsemaye
 *
 */
public class DirectoryReader {

	/**
	 * @param args
	 */
	StringBuffer file;
	
	DirectoryReader(String filePath) {
		file = new StringBuffer(filePath);
		//add throws keyword for file not found or input mismatch
	}
	
	private String[] list(String file) throws NullPointerException {
		File f = new File(file);
		String[] currentFiles;
		List<String> files = new ArrayList<>();
		
		
		if (f.isDirectory()) {
			currentFiles = f.list();
			files.add(f.getName());
			
			for (String s: currentFiles) {
				//get file using s pathname???
				
			}
		}
		return null;	
	}
	
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	@Override 
	public int hashCode() {
		return 0;
	}

}
