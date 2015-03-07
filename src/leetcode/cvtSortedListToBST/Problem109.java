package leetcode.cvtSortedListToBST;

import leetcode.common.ListNode;

/**
 * Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.
 * @author feiyu
 * @since March 7, 2015
 */
public class Problem109 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		
		System.out.println("list: "+ head);
		System.out.println(Solution.sortedListToBST(head));
	}

}
