package leetcode.populateNextRightPointersInEachNode2;

import leetcode.common.TreeLinkNode;

/**
 * Follow up for problem "Populating Next Right Pointers in Each Node".
 * What if the given tree could be any binary tree? Would your previous solution still work?
 * @author feiyu
 * @since March 18, 2015
 */
public class Problem117 {

	public static void main(String[] args) {
		TreeLinkNode root = new TreeLinkNode(1);
		root.right = new TreeLinkNode(2);
		root.right.left = new TreeLinkNode(3);
		root.right.right = new TreeLinkNode(4);
		root.right.left.left = new TreeLinkNode(5);
		root.right.right.left = new TreeLinkNode(6);
		
		Solution.connect(root);
		
		System.out.println();
	}

}
