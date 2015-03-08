package leetcode.insertionSortList;

import leetcode.common.ListNode;

/**
 * Sort a linked list using insertion sort.
 * @author feiyu
 * @since March 8, 2015
 */
public class Problem147 {

	public static void main(String[] args) {
		ListNode head = new ListNode(4);
		head.next = new ListNode(3);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
		
		System.out.println("before sort: "+head);
		System.out.println("after: "+Solution.insertionSortList(head));
	}

}
