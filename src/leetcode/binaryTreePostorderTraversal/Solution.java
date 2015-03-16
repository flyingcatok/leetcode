package leetcode.binaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

import leetcode.common.TreeNode;

/**
 * recursive
 * @author feiyu
 * @since March 16, 2015
 */
public class Solution {
	public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
        	return res;
        }
        res.addAll(postorderTraversal(root.left));
        res.addAll(postorderTraversal(root.right));
        res.add(root.val);
        return res;
    }
}
