package leetcode.sameTree;

import leetcode.common.TreeNode;

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
