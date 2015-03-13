package leetcode.minDepthOfBinaryTree;

import leetcode.common.TreeNode;

/**
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * @author feiyu
 * @since March 13, 2015
 */
public class Problem111 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out.println(Solution.minDepth(root));
	}

}
