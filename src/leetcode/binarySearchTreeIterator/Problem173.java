package leetcode.binarySearchTreeIterator;

import leetcode.common.TreeNode;

/**
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 * Calling next() will return the next smallest number in the BST.
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
 * @author feiyu
 * @since May 9, 2015
 */
public class Problem173 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(9);
		BSTIterator itr = new BSTIterator(root);
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
