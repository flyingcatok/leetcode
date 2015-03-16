package leetcode.binaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

import leetcode.common.TreeNode;

/**
 * Given a binary tree, return the postorder traversal of its nodes' values.
 * @author feiyu
 * @since March 16, 2015
 */
public class Problem145 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		List<Integer> list = new ArrayList<>();
		list  = Solution3.postorderTraversal(root);
		for(int i =0; i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
