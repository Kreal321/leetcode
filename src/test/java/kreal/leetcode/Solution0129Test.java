package kreal.leetcode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for solution.
 */
public class Solution0129Test {

	@Test
	public void test1() {
		int[] nums = new int[] { 1, 2, 3, 1 };

		Solution0129 solution = new Solution0129();
		assertEquals(true, solution.containsNearbyDuplicate(nums, 3));
		
	}
	
	@Test
	public void test2() {
		int[] nums = new int[] { 1, 0, 1, 1 };

		Solution0129 solution = new Solution0129();
		assertEquals(true, solution.containsNearbyDuplicate(nums, 1));
		
	}
	
	@Test
	public void test3() {
		int[] nums = new int[] { 1, 2, 3, 1, 2, 3 };

		Solution0129 solution = new Solution0129();
		assertEquals(false, solution.containsNearbyDuplicate(nums, 2));
		
	}
	
	@Test
	public void test4() {
		int[] nums = new int[] { 1, 2, 3, 1, 1 };

		Solution0129 solution = new Solution0129();
		assertEquals(true, solution.containsNearbyDuplicate(nums, 1));
		
	}



	
}
