package kreal.leetcode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for solution.
 */
public class Solution0121Test {

	@Test
	public void test1() {
		int[] nums = new int[] { 7, 1, 5, 3, 6, 4 };

		Solution0121 solution = new Solution0121();
		assertEquals(5, solution.maxProfit(nums));
		
	}
	
	@Test
	public void test2() {
		int[] nums = new int[] { 7, 6, 4, 3, 1 };

		Solution0121 solution = new Solution0121();
		assertEquals(0, solution.maxProfit(nums));
		
	}
	
	@Test
	public void test3() {
		int[] nums = new int[] { 7 };

		Solution0121 solution = new Solution0121();
		assertEquals(0, solution.maxProfit(nums));
		
	}
	
	@Test
	public void test4() {
		int[] nums = new int[] { 3, 4, 2, 5 };

		Solution0121 solution = new Solution0121();
		assertEquals(3, solution.maxProfit(nums));
		
	}
	
	@Test
	public void test5() {
		int[] nums = new int[] { 3, 5, 2, 3 };

		Solution0121 solution = new Solution0121();
		assertEquals(2, solution.maxProfit(nums));
		
	}
}
