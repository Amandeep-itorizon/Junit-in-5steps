package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AssetTest {

	@Test
	void test() {
		boolean cond = true;
		assertEquals(true, cond);
		assertTrue(cond);
//		assertNull(getClass());
	}

}
