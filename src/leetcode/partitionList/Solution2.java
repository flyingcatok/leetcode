package leetcode.partitionList;

import leetcode.common.ListNode;

/**
 * use two sublists to store results less than and greater than or equal to x.
 * @author feiyu
 * @since March 29, 2015
 */
public class Solution2 {
	public static ListNode partition(ListNode head, int x) {
        if(head == null){
            return head;
        }
        
        ListNode leftList = new ListNode(-1);
        ListNode rightList = new ListNode(-1);
        ListNode left = leftList;
        ListNode right = rightList;
        
        while(head != null){
            int val = head.val;
            if(val < x){
                left.next = head;
                left = left.next;
            } else {
                right.next = head;
                right = right.next;
            }
            head = head.next;
            
            
        }
        // set right list end to null
        right.next = null;
        // connect left list and right list
        left.next = rightList.next;
        return leftList.next;
    }
}
