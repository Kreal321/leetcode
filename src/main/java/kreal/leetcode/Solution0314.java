package kreal.leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;


/**
 * 122. Best Time to Buy and Sell Stock
 * 
 */
public class Solution0314 {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
	       this.val = val;
	       this.left = left;
	       this.right = right;
	    }
	}
	
	/**
	 *  Time: o(logn)
	 *  Space: o(1)
	 *  Memory Usage: 42 MB
	 *  Runtime: 3 ms
	 */
	public List<List<Integer>> verticalOrder(TreeNode root) {
		
		
		
        List<List<Integer>> ans = new LinkedList<>();
        
        if(root == null) return ans;

        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        
        Queue<TreeNode> treeQ = new LinkedList<>();
        Queue<Integer> idxQ = new LinkedList<>();
        treeQ.add(root);
        idxQ.add(0);
        
        while(!treeQ.isEmpty()) {
        	
        	TreeNode current = treeQ.poll();
        	int idx = idxQ.poll();
        	if (!map.containsKey(idx)) {
        		map.put(idx, new LinkedList<Integer>());
        	}
        	map.get(idx).add(current.val);
        	if(current.left != null) {
        		treeQ.add(current.left);
        		idxQ.add(idx -1);
        	}
        	if(current.right != null) {
        		treeQ.add(current.right);
        		idxQ.add(idx +1 );
        	}
        	
        	
        }
        
        
        for(List<Integer> l : map.values()) {
        	ans.add(l);
        }
        
        return ans;
        
    }
    
	
}
