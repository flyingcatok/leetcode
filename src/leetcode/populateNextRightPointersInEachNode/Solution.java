package leetcode.populateNextRightPointersInEachNode;

import leetcode.common.TreeLinkNode;

/**
 * 
 * ref: http://www.ninechapter.com/solutions/populating-next-right-pointers-in-each-node/
 * @since March 18, 2015
 */
public class Solution {
	 public static void connect(TreeLinkNode root) {
		 if (root == null) {
	            return;
	        }

	        TreeLinkNode parent = root;
	        TreeLinkNode next = parent.left;// beginning of next level
	        while (parent != null && next != null) {
	            TreeLinkNode prev = null;// current node to be linked
	            //traverse current level
	            while (parent != null) {
	                if (prev == null) {// prev is at the beginning of the level
	                    prev = parent.left;
	                } else {// prev is linked between two nodes who don't share a common parent
	                    prev.next = parent.left;
	                    prev = prev.next;
	                }
	                // prev is linked between two siblings
	                prev.next = parent.right;
	                prev = prev.next;
	                parent = parent.next;
	            }
	            // move to next level
	            parent = next;
	            next = parent.left;
	        }
	 }
	 
}
