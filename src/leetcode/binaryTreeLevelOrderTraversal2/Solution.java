package leetcode.binaryTreeLevelOrderTraversal2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import leetcode.common.TreeNode;

/**
 * use a stack
 * @author feiyu
 * @since March 13, 2015
 */
public class Solution {
	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root == null){
        	return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        Stack<List<Integer>> stack = new Stack<>();
        while(!queue.isEmpty()){
        	int size = queue.size();
        	List<Integer> q = new LinkedList<>();
        	for(int i=0;i<size;i++){
        		TreeNode node = queue.poll();
        		q.add(node.val);
        		if(node.left != null){
        			queue.offer(node.left);
        		}
        		if(node.right != null){
        			queue.offer(node.right);
        		}
        	}
        	stack.push(q);
        }
        while(!stack.isEmpty()){
        	result.add(stack.pop());
        }
        return result;
    }
}
