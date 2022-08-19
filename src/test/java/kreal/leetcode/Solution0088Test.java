package kreal.leetcode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for solution.
 */
public class Solution0088Test {

	@Test
	public void test1() {
		int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = new int[] { 2, 5, 6 };
		int[] expected = new int[] { 1, 2, 2, 3, 5, 6 };

		Solution0088 solution = new Solution0088();
		solution.merge(nums1, 3, nums2, 3);

		assertArrayEquals(expected, nums1);
	}
	
	@Test
	public void test2() {
		int[] nums1 = new int[] { 0 };
		int[] nums2 = new int[] { 2 };
		int[] expected = new int[] { 2 };

		Solution0088 solution = new Solution0088();
		solution.merge(nums1, 0, nums2, 1);

		assertArrayEquals(expected, nums1);
	}
	
	@Test
	public void test3() {
		int[] nums1 = new int[] { 2 };
		int[] nums2 = new int[] { };
		int[] expected = new int[] { 2 };

		Solution0088 solution = new Solution0088();
		solution.merge(nums1, 1, nums2, 0);

		assertArrayEquals(expected, nums1);
	}
}
