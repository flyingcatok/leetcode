package leetcode.swapNodesInPairs;

import leetcode.common.ListNode;

public class Solution {
	public static ListNode swapPairs(ListNode head) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            return head;
        }
        // at least 2 elements in the list
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode temp;
        
        ListNode curr = head;
        while(curr != null && curr.next != null){
            prev.next = curr.next;
            temp = curr.next.next;
            curr.next.next = curr;
            curr.next = temp;
            
            if(curr == head){
                head = prev.next;
            }
            curr = curr.next;
            prev = prev.next.next;
        }
        return head;
    }
}
