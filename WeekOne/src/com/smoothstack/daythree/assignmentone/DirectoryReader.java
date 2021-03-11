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
	
	File root;
	Integer rootDepth;
	
	//if the file is not a directory is throws a exception
	DirectoryReader(File f) throws Exception {
		if (!f.isDirectory()) {
			throw new Exception();
		}
		root = new File(f.getAbsolutePath());
		rootDepth = this.getDepth(f);
	}
	
	public static void printAll(File root) {

		for (String s : root.list()) {
			File f = new File(root.getAbsolutePath() + "/" + s);

			System.out.println(s);

			if (f.isDirectory()) {
				printAll(f);

			}
		}
	}

	public void printFormatted() {
		this.printFormatted(root);
	}
	
	private void printFormatted(File root) {
		String rootPath = root.getAbsolutePath();

		for (String s : root.list()) {
			File f = new File(rootPath + "/" + s);	
			Integer numOfTabs = this.getDepth(f) - rootDepth;
			String tabs = "";
			
			for (int i = 0; i < numOfTabs - 1; i++) {
				tabs += "\t";
			}
			System.out.println(tabs + s);
			

			if (f.isDirectory()) {
				this.printFormatted(f);

			} 
			
		}
		
	}
	
	private int getDepth(File f) {
		String s  = f.getAbsolutePath();
		Integer depth = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == File.separatorChar) {
				depth++;
			}
		}
		
		return depth;
	}

}
