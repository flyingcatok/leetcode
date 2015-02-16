package leetcode.intersectionOfTwoLinkedList;
import leetcode.common.ListNode;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * @author feiyu
 * @since February 15, 2015
 */
public class Problem160 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(5);
		l1.next.next = new ListNode(10);
		l1.next.next.next = new ListNode(15);
		l1.next.next.next.next = new ListNode(20);
		System.out.println(l1);
		
		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(4);
		l2.next.next = l1.next.next.next;
		l2.next.next.next = l1.next.next.next.next;
		System.out.println(l2);
		
		System.out.println(Solution.getIntersectionNode(l1, l2));
	}

}
