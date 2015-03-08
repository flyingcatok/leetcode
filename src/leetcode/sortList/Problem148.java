package leetcode.sortList;

import leetcode.common.ListNode;

/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 * @author feiyu
 * @since March 8, 2015
 */
public class Problem148 {

	public static void main(String[] args) {
		ListNode head = new ListNode(8);
		head.next = new ListNode(3);
		head.next.next = new ListNode(7);
		head.next.next.next = new ListNode(1);
		head.next.next.next.next = new ListNode(10);
		head.next.next.next.next.next = new ListNode(9);
		head.next.next.next.next.next.next = new ListNode(2);
		
		System.out.println("before sort: "+head);
		System.out.println("after sort: "+Solution.sortList(head));
	}

}
