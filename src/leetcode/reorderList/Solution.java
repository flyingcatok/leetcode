package leetcode.reorderList;

import leetcode.common.ListNode;

/**
 * break, reverse, interleave
 * @author feiyu
 * @since March 8, 2015
 */
public class Solution {
	public static void reorderList(ListNode head) {
        if(head ==null){
            return;
        }
        if(head.next ==null){
            return;
        }

        // at least 2 nodes in least
        ListNode faster = head;
        ListNode leftEnd = new ListNode(-1);
        leftEnd.next = head;
        ListNode right = head;
        while(faster != null){
            faster = faster.next;
            right = right.next;
            leftEnd = leftEnd.next;
            if(faster != null){
                faster = faster.next;
            }
        }
        // break into 2 lists
        leftEnd.next = null;
        
        
        // reverse second list
        ListNode p2;// head of reversed second list
        ListNode prev = right;
        ListNode p = right.next;
        if(p==null){// only one node in right
        	p2 = right;
        }else{
        	ListNode temp = p.next;
        	prev.next = null;
        	while(p!=null){
        		p.next = prev;
        		prev = p;
            
        		p = temp;
        		if(p == null){
        			break;
        		}
        		temp = temp.next;
        	}
        	p2 = prev;
        }
        // now prev is the head of second list, head is head of first list
        ListNode p1 = head;
        boolean turn = true;
        ListNode temp,temp2;
        ListNode curr = p1;
        while(p1 != null && p2 != null){
            if(turn){
                temp = p1.next;
                p1.next = p2;
                curr = curr.next;
                p1 = temp;
                turn = false;
            }else{
                temp2 = p2.next;
                p2.next = p1;
                curr = curr.next;
                p2 = temp2;
                turn = true;
            }
            
        }
	}
}
