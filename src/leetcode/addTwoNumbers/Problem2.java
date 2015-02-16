package leetcode.addTwoNumbers;
import leetcode.common.ListNode;

/**
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * 
 * @author feiyu
 * @since December 26, 2014
 */
public class Problem2 {
	public static void main(String args[]){
		ListNode l1 = new ListNode(9);
		l1.next = new ListNode(1);
		l1.next.next = new ListNode(6);
		System.out.println("List 1: "+l1);
		ListNode l2 = new ListNode(0);
		l2.next = new ListNode(6);
//		l2.next.next = new ListNode(4);
		System.out.println("List 2: "+l2);
		// add two numbers
		System.out.println("Sum: "+Solution.addTwoNumbers(l1, l2));
		
	}
	
}
