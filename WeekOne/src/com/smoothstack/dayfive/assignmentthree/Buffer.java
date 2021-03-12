/**
 * 
 */
package com.smoothstack.dayfive.assignmentthree;

import java.util.List;
import java.util.ArrayList;

/**
 * @author Tsemaye
 *
 */
public class Buffer {
	private volatile static Buffer instance;
	private volatile static List<Integer> buffer;

	public static Buffer getBuffer() {
		if (instance == null) {
			synchronized (Buffer.class) {
				if (instance == null) {
					instance = new Buffer();
					buffer = new ArrayList<>();
				}
			}
		}

		return instance;
	}

	public boolean put(int value) {
		synchronized (buffer) {
			buffer.add(value);
			System.out.println("Add - There are now " + getSize() + " items in the buffer");
		}
		return true;

	}

	
	

	public boolean remove(int index) throws IndexOutOfBoundsException {
		synchronized (buffer) {
			buffer.remove(index);
			System.out.println("Remove - There are now " + getSize() + " items in the buffer");
			return true;

		}

	}


	public int get(int index) throws IndexOutOfBoundsException {
		synchronized (buffer) {
			return buffer.get(index);
		}
	}

	public int getSize() {
		return buffer.size();
	}

}
