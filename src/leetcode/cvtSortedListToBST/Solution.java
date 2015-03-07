package leetcode.cvtSortedListToBST;

import leetcode.common.ListNode;
import leetcode.common.TreeNode;

/**
 * 二分法
 * @author feiyu
 * @since March 7, 2015
 */
public class Solution {
	public static TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return new TreeNode(head.val);
        }
        // at least 2 elements in the list
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode prev = new ListNode(0);
        prev.next = head;
        
        while(p2.next != null){
            prev = prev.next;
            p1 = p1.next;
            p2 = p2.next.next;
            if(p2 == null || p2.next == null){
                break;
            }
        }
        // at this point p1 is at the center of list
        TreeNode root = new TreeNode(p1.val);
        // break list into 2 sub-lists
        prev.next = null;
        // left sub-list
        root.left = sortedListToBST(head);
        // right sub-list
        root.right = sortedListToBST(p1.next);
        
        return root;
    }
}
