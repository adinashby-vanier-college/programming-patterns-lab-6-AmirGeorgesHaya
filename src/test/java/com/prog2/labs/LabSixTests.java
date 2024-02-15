package com.prog2.labs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class LabSixTests {

	@Test
	void kClosestTest1()  {
		int[][] input = {{1, 3}, {-2, 2}};
		int[][] actual = LabSix.kClosest(input, 1);
		
		int[][] expected = {{-2, 2}};
		
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	void kClosestTest2()  {
		int[][] input = {{3, 3}, {5, -1}, {-2, 4}};
		int[][] actual = LabSix.kClosest(input, 2);
		
		int[][] expected = {{3, 3}, {-2, 4}};
		
		Arrays.sort(actual, (a, b) -> a[0] - b[0]);
		Arrays.sort(expected, (a, b) -> a[0] - b[0]);
		
		System.out.println(Arrays.deepToString(expected));
		
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	void kClosestTest3()  {
		int[][] input = {{8, 35}, {32, -10}, {-2, 4}};
		int[][] actual = LabSix.kClosest(input, 2);
		
		int[][] expected = {{-2, 4}, {32, -10}};
		
		Arrays.sort(actual, (a, b) -> a[0] - b[0]);
		Arrays.sort(expected, (a, b) -> a[0] - b[0]);
		
		System.out.println(Arrays.deepToString(expected));
		
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	void kClosestTest4()  {
		int[][] input = {{5, 9}, {3, 5}};
		int[][] actual = LabSix.kClosest(input, 1);
		
		int[][] expected = {{3, 5}};
		
		assertArrayEquals(expected, actual);
		
	}
	
	
}