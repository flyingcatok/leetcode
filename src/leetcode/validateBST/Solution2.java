package leetcode.validateBST;

import leetcode.common.TreeNode;

/**
 * In-order traversal: maintain a last value (max) of traversed nodes.
 * ref: http://www.ninechapter.com/solutions/validate-binary-search-tree/
 * @since March 12, 2015
 */
public class Solution2 {
	private static int lastVal = Integer.MIN_VALUE;
    private static boolean firstNode = true;
    public static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)) {
            return false;
        }
        if (!firstNode && lastVal >= root.val) {
            return false;
        }
        firstNode = false;
        lastVal = root.val;
        if (!isValidBST(root.right)) {
            return false;
        }
        return true;
    }
}
