package leetcode.binaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

import leetcode.common.TreeNode;

/**
 * recursive method
 * @author feiyu
 * @since March 16, 2015
 */
public class Solution {
	public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
        	return result;
        }
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }
}
