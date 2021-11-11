package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath myMath = new MyMath();

	@BeforeAll
	public static void beforeClass() {
		System.out.println("before Class");
	}

	@AfterAll
	public static void afterClass() {
		System.out.println("After Class");
	}

	@BeforeEach
	public void before() {
		System.out.println("Before");
	}

	@Test
	public void sum_with3numbers() {
		assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
		System.out.println("Test1");
	}

	@AfterEach
	public void after() {
		System.out.println("After");
	}

}
