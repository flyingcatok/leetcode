package others.childrenSumProperty;

import leetcode.common.TreeNode;

/**
 * Given a binary tree, write a function that returns true if the tree satisfies below property.
 * For every node, data value must be equal to sum of data values in left and right children. 
 * Consider data value as 0 for NULL children.
 * @author feiyu
 * @since May 7, 2015
 */
public class Problem {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(8);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(2);
		
		System.out.println(Solution.isSumProperty(root));
	}

}
