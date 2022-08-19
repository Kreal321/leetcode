package kreal.leetcode;

import java.util.Arrays;
/**
 * 121. Best Time to Buy and Sell Stock
 * 
 */
public class Solution0121 {

	
	/**
	 *  Time: o(n)
	 *  Space: o(1)
	 *  Memory Usage: 76.2MB
	 *  Runtime: 3 ms
	 */
    public int maxProfit(int[] prices) {
    	
    	assert prices.length > 0;
    	
    	int minimum = prices[0];
    	int profit = 0;
    	
    	for (int i = 1; i < prices.length; i++) {
    		if (prices[i] < minimum) {
    			minimum = prices[i];
    		}
    		int diff = prices[i] - minimum;
    		if (diff > profit) {
    			profit = diff;
    		} 
    		
    	}
    	
    	return profit;
        
    }
	
}
