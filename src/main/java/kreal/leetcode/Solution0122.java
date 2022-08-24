package kreal.leetcode;

import java.util.Arrays;
/**
 * 122. Best Time to Buy and Sell Stock
 * 
 */
public class Solution0122 {

	
	/**
	 *  Time: o(n)
	 *  Space: o(1)
	 *  Memory Usage: 44MB
	 *  Runtime: 3 ms
	 */
    public int maxProfit(int[] prices) {
    	
    	int profit = 0;
    	int temp = Integer.MAX_VALUE;
    	
    	for (int p : prices) {
    		
    		if (p > temp) {
    			profit += p - temp;
    		}
    		temp = p;
    	}
    	
    	return profit;
        
    }
    
	
}
