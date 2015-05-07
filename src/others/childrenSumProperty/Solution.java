package others.childrenSumProperty;

import leetcode.common.TreeNode;

/**
 * traverse the tree. O(n) time
 * @author feiyu
 * @since May 7, 2015
 */
public class Solution {
	public static boolean isSumProperty(TreeNode root) {
		if (root == null || (root.left == null && root.right == null)) {
			return true;
		}
		int leftChildVal = 0;
		int rightChildVal = 0;
		if (root.left != null) {
			leftChildVal = root.left.val;
		}
		if (root.right != null) {
			rightChildVal = root.right.val;
		}
		if (root.val == leftChildVal + rightChildVal) {
			return isSumProperty(root.left) && isSumProperty(root.right);
		} else {
			return false;
		}
	}
}
