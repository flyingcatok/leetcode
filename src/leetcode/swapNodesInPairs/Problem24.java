package leetcode.swapNodesInPairs;

import leetcode.common.ListNode;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * For example,Given 1->2->3->4, you should return the list as 2->1->4->3.
 * @author feiyu
 * @since March 7, 2015
 */
public class Problem24 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		System.out.println("before: "+head);
		System.out.println("after: "+Solution.swapPairs(head));
	}

}
