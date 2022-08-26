package kreal.leetcode;

import java.util.HashMap;

/**
 * 122. Best Time to Buy and Sell Stock
 * 
 */
public class Solution0129 {

	
	/**
	 *  Time: o(n)
	 *  Space: o(1)
	 *  Memory Usage: 111.9 MB
	 *  Runtime: 50 ms
	 */
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        
		HashMap<Integer, Integer> deck = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			if(deck.containsKey(nums[i])) {
				if (i - deck.get(nums[i]) <= k) {
					return true;
				} 
			}
				
			deck.put(nums[i], i);
		}
		
		return false;
    }
    
	
}
