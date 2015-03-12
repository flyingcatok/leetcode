package leetcode.validateBST;

import leetcode.common.TreeNode;

/**
 * ref:http://blog.csdn.net/linhuanmars/article/details/23810735
 * @since March 12, 2015
 */
public class Solution {
	public static boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
	
	private static boolean helper(TreeNode root, long min, long max){
		if(root == null){
			return true;
		}
		if(root.val >= max || root.val <= min){
		    return false;
		}
		return helper(root.left,Integer.MIN_VALUE,root.val) && helper(root.right,root.val, Integer.MAX_VALUE);
	}

}
