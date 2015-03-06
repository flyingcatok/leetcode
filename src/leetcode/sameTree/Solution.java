package leetcode.sameTree;

import leetcode.common.TreeNode;

/**
 * Preorder Traversal.
 * @author feiyu
 * @since March 6, 2015
 */
public class Solution {
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null){
			return true;
		}else if((p == null && q!= null) || (p!=null && q==null)){
			return false;
		}
		// p,q not null
		if(p.val != q.val){
			return false;
		}else{
			return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
		}
		
    }
	
}
