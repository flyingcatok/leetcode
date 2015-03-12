package leetcode.validateBST;

import leetcode.common.TreeNode;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * @author feiyu
 * @since March 12, 2015
 */
public class Problem98 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
		
		System.out.println(Solution.isValidBST(root));
	}

}
