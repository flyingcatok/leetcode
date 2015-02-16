package leetcode.rotateList;

import leetcode.common.ListNode;

/**
 * Slow.
 * @author feiyu
 * @since January 14, 2015
 */
public class Solution {
	public static ListNode rotateRight(ListNode head, int n) {
		if(head ==null){
			return null;
		}
		if(n==0){
			return head;
		}
		//n >0
		// get the length of list
		ListNode c = head;
		int length = 0;
		while(c != null){
			length++;
			c = c.next;
		}
		// may go around several times
		n = n % length;
		
		// two pointers
		ListNode p1 = head,p2=p1;
		while(n > 0){
			p2 =p2.next;
			n--;
		}
		//move p1,p2 together
		while(p2.next!=null){
			p1 = p1.next;
			p2 = p2.next;
		}
		
		p2.next = head;
		head = p1.next;
		p1.next = null;
		
		return head;
        
    }
}
