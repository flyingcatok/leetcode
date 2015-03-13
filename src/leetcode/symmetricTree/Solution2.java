package leetcode.symmetricTree;

import java.util.LinkedList;
import java.util.Queue;

import leetcode.common.TreeNode;

/**
 * iterative method
 * ref: https://github.com/zsxwing/leetcode-java/blob/master/src/main/java/symmetric_tree/SymmetricTree.java
 * @since March 13, 2015
 */
public class Solution2 {
	public static boolean isSymmetric(TreeNode root) {
		if(root == null){
			return true;
		}
		Queue<TreeNode> leftSubtreeNodes = new LinkedList<TreeNode>();
		Queue<TreeNode> rightSubtreeNodes = new LinkedList<TreeNode>();
		leftSubtreeNodes.add(root.left);
		rightSubtreeNodes.add(root.right);
		while(!leftSubtreeNodes.isEmpty() && !rightSubtreeNodes.isEmpty()){
			TreeNode left = leftSubtreeNodes.poll();
			TreeNode right = rightSubtreeNodes.poll();
			if(left == null && right == null){
//				return true;
				continue;
			}
			if(left==null || right == null){
				return false;
			}
			if(left.val != right.val){
				return false;
			}
			// insert next level nodes in such order
			leftSubtreeNodes.add(left.left);
			leftSubtreeNodes.add(left.right);
			rightSubtreeNodes.add(right.right);
			rightSubtreeNodes.add(right.left);
		}
		// after processing all levels, the queues should be empty
		return leftSubtreeNodes.isEmpty() && rightSubtreeNodes.isEmpty();
	}
}
