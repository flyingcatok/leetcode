package lintcode.lowestCommonAncestor;

import leetcode.common.TreeNode;

/**
 * Given the root and two nodes in a Binary Tree. Find the lowest common ancestor(LCA) of the two nodes.
 * The lowest common ancestor is the node with largest depth which is the ancestor of both nodes.
 * ref: cracking the codeing interview
 * @since April 20, 2015
 */
public class Problem {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(3);
		root.right = new TreeNode(7);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(6);
		System.out.println("3,5: " + Solution.lowestCommonAncestor(root, root.left, root.right.left).val);
		System.out.println("5,6: " + Solution.lowestCommonAncestor(root, root.right.right, root.right.left).val);
		System.out.println("6,7: " + Solution.lowestCommonAncestor(root, root.right, root.right.right).val);

	}

}
