package leetcode.linkedListCycle;

import leetcode.common.ListNode;

/**
 * Given a linked list, determine if it has a cycle in it.
 * @author feiyu
 * @since March 7, 2015
 */
public class Problem141 {

	public static void main(String[] args) {
		ListNode head = new ListNode(10);
		head.next = new ListNode(9);
		head.next.next = new ListNode(8);
		head.next.next.next = new ListNode(7);
		head.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next = head.next.next;
		
		System.out.println(Solution.hasCycle(head));
	}

}
