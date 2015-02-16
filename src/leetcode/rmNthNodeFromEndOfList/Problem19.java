package leetcode.rmNthNodeFromEndOfList;
import leetcode.common.ListNode;

/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * 
 * @author feiyu
 * @since December 31, 2014
 */
public class Problem19 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
//		l1.next.next = new ListNode(3);
//		l1.next.next.next = new ListNode(4);
//		l1.next.next.next.next = new ListNode(5);
//		l1.next.next.next.next.next = new ListNode(6);
//		l1.next.next.next.next.next.next = new ListNode(7);
//		l1.next.next.next.next.next.next.next = new ListNode(8);
//		l1.next.next.next.next.next.next.next.next = new ListNode(9);
//		l1.next.next.next.next.next.next.next.next.next = new ListNode(10);
		System.out.println(l1);
		int n = 2;
		System.out.println(Solution.removeNthFromEnd(l1, n));
		
	}

}
