package leetcode.symmetricTree;

import leetcode.common.TreeNode;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * Bonus points if you could solve it both recursively and iteratively.
 * @author feiyu
 * @since March 13, 2015
 */
public class Problem101 {

	public static void main(String[] args) {
//		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(2);
//		root.left.left = new TreeNode(3);
//		root.left.right = new TreeNode(4);
//		root.right.left = new TreeNode(4);
//		root.right.right = new TreeNode(3);
		
		TreeNode root = new TreeNode(9);
		root.left = new TreeNode(-42);
		root.right = new TreeNode(-42);
		root.left.right = new TreeNode(76);
		root.right.left = new TreeNode(76);
		root.left.right.right = new TreeNode(13);
		root.right.left.right = new TreeNode(13);
		System.out.println(Solution.isSymmetric(root));
		System.out.println(Solution2.isSymmetric(root));
	}

}
