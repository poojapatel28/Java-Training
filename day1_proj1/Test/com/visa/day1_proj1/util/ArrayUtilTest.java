package com.visa.day1_proj1.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayUtilTest {

	@Test
	public void testGetsum() {
		int[] data= {3,4,5};
		assertEquals(12, ArrayUtil.getsum(data));
		
		
		int[] ele = {-1,0,1};
		assertEquals(0, ArrayUtil.getsum(ele));
	}

	@Test
	public void testGetCount() {
		
		int[] elems = {34,5,7,7,43,77};
		assertEquals(2, ArrayUtil.getCount(elems, 7));
	}

	@Test
	public void testSort() {
		int[] elems = {34,5,7,7,43,77};
		ArrayUtil.sort(elems);
		int[] expected = {5,7,7,34,43,77};
		assertArrayEquals(expected, elems);
	}

}
