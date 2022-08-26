package kreal.leetcode;


import java.util.HashSet;



/**
 * 122. Best Time to Buy and Sell Stock
 * 
 */
public class Solution1650 {

	class Node {
	    public int val;
	    public Node left;
	    public Node right;
	    public Node parent;
	};
	
	/**
	 *  Time: o(n)
	 *  Space: o(1)
	 *  Memory Usage: 48.5 MB
	 *  Runtime: 40 ms
	 */
	public Node lowestCommonAncestor(Node p, Node q) {
		HashSet<Integer> path = new HashSet<>();
        
        Node current = p;
        
        while(current != null) {
        	path.add(current.val);
        	current = current.parent;
        }
        
        current = q;
        
        while(!path.contains(current.val)) {
        	current = current.parent;
        }
        
        
        return current;
        
    }
    
	
}
