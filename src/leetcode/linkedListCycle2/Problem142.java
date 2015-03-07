package leetcode.linkedListCycle2;

import leetcode.common.ListNode;

/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * @author feiyu
 * @since March 7, 2015
 */
public class Problem142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(10);
		head.next = new ListNode(9);
		head.next.next = new ListNode(8);
		head.next.next.next = new ListNode(7);
		head.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next = head.next.next;
		System.out.println(head);
		System.out.println(Solution.detectCycle(head));
	}

}
