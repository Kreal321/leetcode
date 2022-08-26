package kreal.leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;


/**
 * 366. Find Leaves of Binary Tree
 * 
 */
public class Solution0336 {

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
	
	
	public int addToMap (HashMap<TreeNode, Integer> map, TreeNode root) {

		
		int idx = 0;
		
		if(root.left != null) {
			idx = Math.max(addToMap(map, root.left) + 1, idx);
		}
		
		if(root.right != null) {
			idx = Math.max(addToMap(map, root.right) + 1, idx);
		}
		
		map.put(root, idx);
		
		return idx;
		
	}
	
	/**
	 *  Time: o(n)
	 *  Space: o(n)
	 *  Memory Usage: 42.6 MB
	 *  Runtime: 4 ms
	 */
	public List<List<Integer>> findLeaves(TreeNode root) {
	
		List<List<Integer>> ans = new ArrayList<>();
	
		HashMap<TreeNode, Integer> map = new HashMap<>();
		
		// DFS
		if (root == null) return ans;
		
		addToMap(map, root);
		
		TreeMap<Integer, List<Integer>> ansTree = new TreeMap<>();
		
		for(Map.Entry<TreeNode, Integer> elt : map.entrySet()) {
			if(!ansTree.containsKey(elt.getValue())) {
				ansTree.put(elt.getValue(), new ArrayList<Integer>());
			}
			ansTree.get(elt.getValue()).add(elt.getKey().val);
		}
		
        
		for(List<Integer> list : ansTree.values()) {
			ans.add(list);
		}
		
		return ans;
		
    }
    
	
}
