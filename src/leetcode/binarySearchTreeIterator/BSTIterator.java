package leetcode.binarySearchTreeIterator;

import java.util.Stack;

import leetcode.common.TreeNode;

public class BSTIterator {
	Stack<TreeNode> stack = new Stack<>();
    TreeNode curr;
    public BSTIterator(TreeNode root) {
        curr = root;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return (curr != null || !stack.isEmpty());
    }

    /** @return the next smallest number */
    public int next() {
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }
        curr = stack.pop();
        TreeNode nextNode = curr;
        curr = curr.right;
        return nextNode.val;
    }
}
