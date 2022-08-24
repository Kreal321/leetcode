package kreal.leetcode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for solution.
 */
public class Solution0122Test {

	@Test
	public void test1() {
		int[] nums = new int[] { 7, 1, 5, 3, 6, 4 };

		Solution0122 solution = new Solution0122();
		assertEquals(7, solution.maxProfit(nums));
		
	}
	
	@Test
	public void test2() {
		int[] nums = new int[] { 1, 2, 3, 4, 5 };

		Solution0122 solution = new Solution0122();
		assertEquals(4, solution.maxProfit(nums));
		
	}
	
	@Test
	public void test3() {
		int[] nums = new int[] { 7 };

		Solution0122 solution = new Solution0122();
		assertEquals(0, solution.maxProfit(nums));
		
	}
	
	@Test
	public void test4() {
		int[] nums = new int[] { 7, 6, 4, 3, 1 };

		Solution0122 solution = new Solution0122();
		assertEquals(0, solution.maxProfit(nums));
		
	}
	
}
