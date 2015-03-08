package leetcode.reverseLinkedList2;

import leetcode.common.ListNode;

/**
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * For example:Given 1->2->3->4->5->NULL, m = 2 and n = 4,return 1->4->3->2->5->NULL.
 * Given m, n satisfy the following condition:
 * 1 ≤ m ≤ n ≤ length of list.
 * @author feiyu
 * @since March 8, 2015
 */
public class Problem92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		System.out.println("list: "+head);
		System.out.println("reverse: "+Solution.reverseBetween(head, 1,4));
	}

}
