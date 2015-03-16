package leetcode.binaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

import leetcode.common.TreeNode;

/**
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * @author feiyu
 * @since March 16, 2015
 */
public class Problem144 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		List<Integer> list = new ArrayList<>();
		list  = Solution2.preorderTraversal(root);
		for(int i =0; i<list.size();i++){
			System.out.println(list.get(i));
		}
				
	}

}
