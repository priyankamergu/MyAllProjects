package com.cal;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalulatorTest {
	Calulator c=new Calulator();
	int res;
	float res1;
	@Test
	public void testAdd() {
		
		
		res=c.add(10, 20);
		
			assertEquals(30, res);
		
	}

	@Test
	public void testSub() {
		res=c.sub(20, 30);
		assertEquals(-10, res);
	}

	@Test
	public void testMul() {
		res1=c.mul(2,5);

		assertEquals(10f, res1,10.1f);
	}

	@Test
	public void testDiv() {
		res1=c.div(4, 2);
		assertEquals(2, res1,2.0f);
	}

}
