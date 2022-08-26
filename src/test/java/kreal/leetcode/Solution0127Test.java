package kreal.leetcode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for solution.
 */
public class Solution0127Test {

	@Test
	public void test1() {
		int[] nums = new int[] { 1, 2, 3, 1 };

		Solution0127 solution = new Solution0127();
		assertEquals(true, solution.containsDuplicate(nums));
		
	}
	
	@Test
	public void test2() {
		int[] nums = new int[] { 1, 2, 3, 4 };

		Solution0127 solution = new Solution0127();
		assertEquals(false, solution.containsDuplicate(nums));
		
	}
	@Test
	public void test3() {
		int[] nums = new int[] { 1, 1, 3, 1 };

		Solution0127 solution = new Solution0127();
		assertEquals(true, solution.containsDuplicate(nums));
		
	}


	
}
