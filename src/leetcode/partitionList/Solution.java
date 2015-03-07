package leetcode.partitionList;

import leetcode.common.ListNode;

public class Solution {
	public static ListNode partition(ListNode head, int x) {
        if(head == null){
            return head;
        }
        
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode head_prev = prev;
        ListNode curr = head;
        
        while(curr != null && curr.val < x){
            prev = prev.next;
            curr = curr.next;
        }
        // at this point, curr points to first number which is larger than x
        if(curr == null){
            return head;// all numbers are larger than x
        }
        
        ListNode temp;
        ListNode prev1 = prev;
        while(curr != null){
            if(curr.val < x){
                // break curr from last half
                prev1.next = curr.next;
                // link curr to first half
                temp = prev.next;
                prev.next = curr;
                curr.next = temp;
                prev = curr;
                curr = prev1.next;
            }else{
            	prev1 = prev1.next;
            	curr = curr.next;
            }
        }

        return head_prev.next;
    }
}
