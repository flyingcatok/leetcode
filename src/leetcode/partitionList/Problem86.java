package leetcode.partitionList;

import leetcode.common.ListNode;

/**
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * For example,Given 1->4->3->2->5->2 and x = 3,return 1->2->2->4->3->5.
 * 
 * @author feiyu
 * @since March 7, 2015
 */
public class Problem86 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(4);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(2);
		
		System.out.println(Solution.partition(head, 3));
		
	}

}
