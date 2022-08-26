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
 *  236. Lowest Common Ancestor of a Binary Tree
 * 
 */
public class Solution0236 {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { this.val = x; }
	}
	
	/**
	 *  Time: o(n)
	 *  Space: o(n)
	 *  Memory Usage: 47.7 MB
	 *  Runtime: 11 ms
	 */
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		if(root == null || root == p || root == q) {
			return root;
		}
		
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		
		if(left == null) return right;
		if(right == null) return left;
		
		return root;
        
    }
    
	
}
