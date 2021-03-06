package leetcode.binaryTreeLevelOrderTraversal;

import java.util.LinkedList;
import java.util.List;

import leetcode.common.TreeNode;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * @author feiyu
 * @since March 13, 2015
 */
public class Problem102 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		List<List<Integer>> result = new LinkedList<>();
		result = Solution.levelOrder(root);
		for(int i=0;i<result.size();i++){
			System.out.print("[");
			for(int j=0; j<result.get(i).size();j++){
				System.out.print(result.get(i).get(j)+" ");
			}
			System.out.print("]");
		}
		
	}

}
