package leetcode.linkedListCycle2;

import leetcode.common.ListNode;

/**
 * reference: http://fisherlei.blogspot.com/2013/11/leetcode-linked-list-cycle-ii-solution.html
 * @author feiyu
 * @since March 7, 2015
 */
public class Solution {
	public static ListNode detectCycle(ListNode head) {
		if(head == null){
            return null;
        }
        // head != null
        ListNode p1 = head;
        ListNode p2 = head;
        while(p1 != null && p2 != null){
            p1 = p1.next;
            p2 = p2.next;
            if(p2 != null){
                p2 = p2.next;
            }
            if(p1 == p2){
                break;
            }
        }
        if(p2 == null){
            return null;
        }
        p1 = head;
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
	}
}
