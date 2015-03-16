package leetcode.binaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import leetcode.common.TreeNode;

/**
 * iterative method
 * ref: http://blog.csdn.net/linhuanmars/article/details/20187257
 * @since March 16, 2015
 */
public class Solution2 {
	public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        // root == null is covered below
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.isEmpty()){
        	if(root != null){
        		stack.push(root);
        		root = root.left;
        	}else{
        		root = stack.pop();
        		result.add(root.val);
        		root = root.right;
        	}
        }
        return result;
        
	}
}
