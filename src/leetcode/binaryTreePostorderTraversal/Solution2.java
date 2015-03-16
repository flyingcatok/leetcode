package leetcode.binaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import leetcode.common.TreeNode;

/**
 * iterative
 * ref: http://blog.csdn.net/linhuanmars/article/details/22009351
 * @since March 16, 2015
 */
public class Solution2 {
	public static List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if(root == null){
			return res;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode curr = root;
		TreeNode prev = null;
		stack.push(root);
		while(!stack.isEmpty()){
			curr = stack.peek();
			if(prev == null || prev.left == curr || prev.right == curr){// traverse downward
				if(curr.left != null){
					stack.push(curr.left);
				}else if(curr.right != null){
					stack.push(curr.right);
				}else{// leaf node
					res.add(curr.val);
					stack.pop();
				}
			}else if(curr.left == prev){// traverse upward from left child
				if(curr.right != null){
					stack.push(curr.right);
				}
			}else{// traverse upward from right child
				res.add(curr.val);
				stack.pop();
			}
			prev = curr;
		}
		return res;
	}
}
