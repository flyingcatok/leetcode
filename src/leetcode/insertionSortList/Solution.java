package leetcode.insertionSortList;

import leetcode.common.ListNode;

/**
 * insertion: loop from beginning of list (forward not backward)
 * @author feiyu
 * @since March 8, 2015
 */
public class Solution {
	public static ListNode insertionSortList(ListNode head) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            return head;
        }
        // at least 2 nodes
        ListNode head0 = new ListNode(-1);
        head0.next = head;
        ListNode p = head.next;
        ListNode p_prev = head;
        
        while(p != null){
            ListNode temp = p.next;
            // p.next = null;
            ListNode curr = head0.next;
            ListNode prev = head0;
            boolean flag = false;
            while(curr != p){
                if(curr.val > p.val){
                    prev.next = p;
                    p.next = curr;
                    p_prev.next = temp;
                    
                    flag = true;
                    System.out.println("processing: "+head0.next);
                    break;
                    
                }
                // advance curr, prev
                curr = curr.next;
                prev = prev.next;
            }
            if(!flag){
            	p_prev = p;
            }
            p = temp;
        }
        return head0.next;
    }
}
