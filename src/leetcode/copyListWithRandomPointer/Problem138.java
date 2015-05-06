package leetcode.copyListWithRandomPointer;

import leetcode.common.RandomListNode;

/**
 * A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
 * Return a deep copy of the list.
 * @author feiyu
 * @since May 6, 2015
 */
public class Problem138 {

	public static void main(String[] args) {
		RandomListNode head = new RandomListNode(0);
		head.next = new RandomListNode(1);
		head.next.next = new RandomListNode (2);
		head.next.next.next = new RandomListNode(3);
		head.random = head.next.next.next;
		head.next.random = head.next.next;
		RandomListNode clone = Solution.copyRandomList(head);
		System.out.println();
	}

}
