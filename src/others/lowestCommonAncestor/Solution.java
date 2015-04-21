package others.lowestCommonAncestor;

import leetcode.common.TreeNode;

public class Solution {
	/**
	 * if A and B are both on the left of the node, branch left to look for the LCA;
	 * if they are both on the right of the node, branch right to look for the LCA;
	 * when A and B are no longer on the same side, LCA found.
     * @param root: The root of the binary search tree.
     * @param A and B: two nodes in a Binary.
     * @return: Return the least common ancestor(LCA) of the two nodes.
     */
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        // write your code here
        if (!covers(root, A) || !covers(root, B)) {
            return null;
        }
        return helper(root, A, B);
    }
    
    // O(n)
    private static boolean covers(TreeNode root, TreeNode A) {
        if (root == null) {
            return false;
        }
        if (root == A) {
            return true;
        }
        return covers(root.left, A) || covers(root.right, A);
    }
    
    private static TreeNode helper(TreeNode root, TreeNode A, TreeNode B) {
        if (root == null) {
            return root;
        }
        if (root == A || root == B) {
            return root;
        }
        boolean is_A_on_left = covers(root.left, A);//O(n)
        boolean is_B_on_left = covers(root.left, B);//O(n)
        if (is_A_on_left != is_B_on_left) {
            return root;
        }
        TreeNode which_side = is_A_on_left ? root.left : root.right;
        return helper(which_side, A, B);//O(n/2)
    }
}
