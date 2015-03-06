package leetcode.balancedBinaryTree;

import leetcode.common.TreeNode;

/**
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as a binary tree 
 * in which the depth of the two subtrees of “every node” never differ by more than 1.
 * @author feiyu
 * @since March 6, 2015
 */
public class Problem110 {

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(10);
		root1.left = new TreeNode(9);
		root1.left.left = new TreeNode(7);
		root1.left.right = new TreeNode(6);
		root1.right = new TreeNode(8);
		root1.right.left = new TreeNode(5);
		
		System.out.println(Solution.isBalanced(root1));
	}

}
