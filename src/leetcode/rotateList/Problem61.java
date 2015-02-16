package leetcode.rotateList;

import leetcode.common.ListNode;

/**
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 * @author feiyu
 * @since January 14, 2015
 */
public class Problem61 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
//		ListNode l1 = null;
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);
		System.out.println(l1);
		System.out.println(Solution.rotateRight(l1, 6));
	}

}
