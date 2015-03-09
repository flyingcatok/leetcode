package leetcode.reorderList;

import leetcode.common.ListNode;

/**
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 * You must do this in-place without altering the nodes' values.
 * For example,Given {1,2,3,4}, reorder it to {1,4,2,3}.
 * 
 * @author feiyu
 * @since March 8, 2015
 */
public class Problem143 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next = new ListNode(7);
		head.next.next.next.next.next.next.next = new ListNode(8);
		head.next.next.next.next.next.next.next.next= new ListNode(9);
		
		System.out.println("before: "+head);
		Solution.reorderList(head);
		System.out.println("after: "+head);
	}

}
