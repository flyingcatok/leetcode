package others.cvtTernaryExpressionToBinaryTree;

import leetcode.common.TreeNode;

/**
 * How to convert a ternary expression of the form a?b:c into a binary tree structure? 
 * The expression can be nested.
 * @author feiyu
 * @since April 10, 2015
 */
public class Problem {

	public static void main(String[] args) {
//		String str = "a?b:c?d:e";
		String str = "a?b?d:e?h:i:c?f?j:k:g";
		TreeNode result = Solution.ternaryToBinaryTree(str);
		System.out.println();
	}

}
