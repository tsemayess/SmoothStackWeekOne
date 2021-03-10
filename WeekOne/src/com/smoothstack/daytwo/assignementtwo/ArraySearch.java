/**
 * 
 */
package com.smoothstack.daytwo.assignementtwo;

/**
 * @author Tsemaye
 *
 */
public class ArraySearch {
	Double[][] array;
	Double max = 0.0;
	Integer maxRow;
	Integer maxColumn;
	
	/**
	 * 
	 * @param a
	 */
	ArraySearch(Double[][] a) {
		array = a.clone();
		this.setValues();
	}
	
	/**
	 * 
	 * @return
	 */
	public double getMax() {
		return max.doubleValue();
	}
	
	/**
	 * 
	 * @return
	 */
	public int getMaxRow() {
		return maxRow.intValue();
		
	}
	
	/**
	 * 
	 * @return
	 */
	public int getMaxColumn() {
		return maxColumn.intValue();
	}
	
	/**
	 * 
	 */
	private void setValues() {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					maxRow = i;
					maxColumn = j;
					max = array[i][j];
				}
			}
			
		}
		
	}
	

}
