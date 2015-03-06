package leetcode.sameTree;

import leetcode.common.TreeNode;

/**
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 * @author feiyu
 * @since March 6, 2015
 */
public class Problem100 {

	public static void main(String[] args) {
		TreeNode p = new TreeNode(10);
		p.left = new TreeNode(5);
		p.right = new TreeNode(7);
		
		TreeNode q = new TreeNode(10);
		q.left = new TreeNode(5);
		q.right = new TreeNode(7);
		
		System.out.println(Solution.isSameTree(p, q));
	}

}
