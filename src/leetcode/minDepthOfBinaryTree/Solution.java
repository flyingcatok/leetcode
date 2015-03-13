package leetcode.minDepthOfBinaryTree;

import leetcode.common.TreeNode;

/**
 * 
 * ref: http://blog.csdn.net/linhuanmars/article/details/19660209
 * @since March 13, 2015
 */
public class Solution {
    public static int minDepth(TreeNode root) {
    	if(root == null){
    		return 0;
    	}
    	// if a node has only one null node, it's not a leaf
    	if(root.left == null){
    		return 1+ minDepth(root.right);
    	}
    	if(root.right == null){
    		return 1+ minDepth(root.left);
    	}
    	return 1+ Math.min(minDepth(root.left), minDepth(root.right));
    	
    }
}
