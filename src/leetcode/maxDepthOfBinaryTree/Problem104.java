package leetcode.maxDepthOfBinaryTree;
import leetcode.common.TreeNode;
/**
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * @author feiyu
 * @since March 6, 2015
 */
public class Problem104 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(9);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(6);
		root.right.left = new TreeNode(5);
		System.out.println("max depth: 4");
		System.out.println("alg: "+Solution.maxDepth(root));
	}

}
