package others.cvtTernaryExpressionToBinaryTree;

import java.util.Stack;

import leetcode.common.TreeNode;

/**
 * 
 * ref: http://stackoverflow.com/questions/28487831/how-to-convert-a-ternary-expression-to-a-binary-tree-structure
 * @since April 10, 2015
 */
public class Solution {
	public static TreeNode ternaryToBinaryTree(String str) {
		char[] chars = str.toCharArray();
		TreeNode root = new TreeNode(chars[0]);
		TreeNode parent = root;
		Stack<TreeNode> stack = new Stack<>();
		for(int i = 1; i < chars.length; i+=2){
			if(chars[i] == '?'){
				parent.left = new TreeNode(chars[i+1]);
				stack.push(parent);
				parent = parent.left;
			} else if (chars[i] == ':'){
				parent = stack.pop();
				while(parent.right != null){
					parent = stack.pop();
				}
				parent.right = new TreeNode(chars[i+1]);
				stack.push(parent);
				parent = parent.right;
			}
		}
		return root;
	}
}
