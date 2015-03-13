package leetcode.binaryTreeLevelOrderTraversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import leetcode.common.TreeNode;

/**
 * BFS
 * @author feiyu
 * @since March 15, 2015
 */
public class Solution {
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new LinkedList<>();
		if(root == null){
			return result;
		}

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
        	int size = queue.size();
        	List<Integer> res = new LinkedList<>();
        	// use size to control output and reuse the same queue.
        	for(int i=0;i<size;i++){
        		TreeNode node = queue.poll();
        		res.add(node.val);
        		if(node.left != null){
        			queue.offer(node.left);
        		}
        		if(node.right != null){
        			queue.offer(node.right);
        		}
        	}
        	result.add(res);
        }
        return result;
    }
}
