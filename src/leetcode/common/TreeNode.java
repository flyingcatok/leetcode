package leetcode.common;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for binary tree node.
 * @author feiyu
 * @since February 17, 2015
 */
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(int x){
		val = x;
	}
	
//	public String toString(){
//		StringBuilder builder = new StringBuilder();
//		Queue<TreeNode> queue = new LinkedList<>();
//		TreeNode temp = this;
//		while(temp != null){
//			if(temp.val == Integer.MAX_VALUE){
//				builder.append("#,");
//			}
//			builder.append(temp.val+",");
//			if(temp.left!=null){
//				queue.add(temp.left);
//			}else{
//				queue.add(new TreeNode(Integer.MAX_VALUE));
//			}
//			if(temp.right!=null){
//				queue.add(temp.right);
//			}else{
//				queue.add(new TreeNode(Integer.MAX_VALUE));
//			}
//			
//			temp = queue.poll();
//		}
//		return builder.toString();
//		
//	}
}
