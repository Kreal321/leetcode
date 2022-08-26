package kreal.leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 122. Best Time to Buy and Sell Stock
 * 
 */
public class Solution0127 {

	
	/**
	 *  Time: o(n)
	 *  Space: o(1)
	 *  Memory Usage: 69.6MB
	 *  Runtime: 13 ms
	 */
	public boolean containsDuplicate(int[] nums) {
        
		HashSet<Integer> current = new HashSet<>();
		
		for(int n : nums) {
			if(current.contains(n)) {
				return true;
			} else {
				current.add(n);
			}
		}
		
		return false;
    }
    
	
}
