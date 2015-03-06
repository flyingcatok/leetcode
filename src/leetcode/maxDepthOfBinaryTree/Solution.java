package leetcode.maxDepthOfBinaryTree;

import leetcode.common.TreeNode;

/**
 * recursion.
 * @author feiyu
 * @since March 6, 2015
 */
public class Solution {

	public static int maxDepth(TreeNode root) {
		 if(root == null){
			 return 0;
	     }
		 System.out.println(root.val);
	     return 1+ Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
