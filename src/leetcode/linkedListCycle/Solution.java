package leetcode.linkedListCycle;

import leetcode.common.ListNode;

/**
 * 2 pointers
 * @author feiyu
 * @since March 7, 2015
 */
public class Solution {
	public static boolean hasCycle(ListNode head) {
        if(head == null){
    		return false;
    	}
        ListNode p1 = head;// 1 step
        ListNode p2 = head;// 2 steps
        // head != null
        while(p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2){
                return true;
            }else if(p2 == null){
                break;
            }
        }
        return false;
    }
}
