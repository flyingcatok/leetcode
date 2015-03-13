package leetcode.pathSum;

import leetcode.common.TreeNode;

/**
 * 
 * ref: http://www.ninechapter.com/solutions/path-sum/
 * @since March 13, 2015
 */
public class Solution {
	public static boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
            return false;
        }
		// if it is leaf, and its value equals the rest of sum, return true
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        return hasPathSum (root.left, sum - root.val)
            || hasPathSum(root.right, sum - root.val);
    }

}
