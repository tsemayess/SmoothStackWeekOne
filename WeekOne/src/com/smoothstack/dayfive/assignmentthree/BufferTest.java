/**
 * 
 */
package com.smoothstack.dayfive.assignmentthree;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * @author Tsemaye
 *
 */
public class BufferTest {
	
	Buffer buffer = Buffer.getBuffer();
	
	@Test
	public void getBuffer() {
		
		assertEquals(buffer, Buffer.getBuffer());
	}
	
	@Test
	public void put() {
		
		assertEquals(true, buffer.put(0));
		
	}
	
	@Test
	public void removeHP() {
		for (int i = 0; i < 5; i++) {
			buffer.put(i);
		}
		
		assertEquals(true, buffer.remove(buffer.getSize() - 1));
		
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void removeSP() {
		
		buffer.remove(buffer.getSize());
		
	}
	
	@Test
	public void get() {
		int j = 0;
		assertEquals(j, buffer.get(j));
	}

}
