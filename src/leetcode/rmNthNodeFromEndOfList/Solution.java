package leetcode.rmNthNodeFromEndOfList;
import leetcode.common.ListNode;

/**
 * 
 * @author feiyu
 * @since December 31, 2014
 */
public class Solution {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode p1 = head;
		ListNode p2 = p1;
		int counter = n;
		
		while(counter > 0){// move p2
			p2 = p2.next;
			counter--;
		}
		
		if(p2 != null){
			while(p2.next != null){ // move p1, p2 together
				p1 = p1.next;
				p2 = p2.next;
			}
			p1.next = p1.next.next;
		}else{
			head=p1.next; // delete head
		}

		return head;
        
    }
}
