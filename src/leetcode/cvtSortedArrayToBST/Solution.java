package leetcode.cvtSortedArrayToBST;

import leetcode.common.TreeNode;

/**
 * 
 * @author feiyu
 * @since March 18, 2015
 */
public class Solution {
	public static TreeNode sortedArrayToBST(int[] num) {
        int N = num.length;
        if(N==0){
            return null;
        }
        if(N==1){
            return new TreeNode(num[0]);
        }
        return helper(num, 0, N-1);
    }
    
    private static TreeNode helper(int[]num, int left, int right){
    	if(left > right){
            return null;
        }
    	int mid = left + (right-left)/2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = helper(num, left, mid-1);
        root.right = helper(num, mid+1, right);
        return root;
    }
}
