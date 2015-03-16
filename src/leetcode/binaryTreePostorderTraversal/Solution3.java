package leetcode.binaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import leetcode.common.TreeNode;

/**
 * another iterative method, similar to inorder traversal solution2
 * ref: http://blog.csdn.net/linhuanmars/article/details/22009351
 * @since March 16, 2015
 */
public class Solution3 {
	public static List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if(root == null){
			return res;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode prev = null;
		while(root != null || !stack.isEmpty()){
			if(root != null){
				stack.push(root);
				root = root.left;
			}else{
				TreeNode peekNode = stack.peek();
				if(peekNode.right != null && peekNode.right != prev){// not yet traverse right subtree, then 
					root = peekNode.right;
				}else{
					res.add(peekNode.val);
					stack.pop();
					prev = peekNode;
				}
			}
		}
		return res;
	}
}	
