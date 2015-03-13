package leetcode.pathSum;

import leetcode.common.TreeNode;

/**
 * Given a binary tree and a sum, 
 * determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 * @author feiyu
 * @since March 13, 2015
 */
public class Problem112 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		System.out.println(Solution.hasPathSum(root, 1));
	}

}
