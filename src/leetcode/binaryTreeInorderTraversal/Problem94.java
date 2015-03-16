package leetcode.binaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

import leetcode.common.TreeNode;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * @author feiyu
 * @since March 16, 2015
 */
public class Problem94 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		List<Integer> list = new ArrayList<>();
		list  = Solution3.inorderTraversal(root);
		for(int i =0; i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
