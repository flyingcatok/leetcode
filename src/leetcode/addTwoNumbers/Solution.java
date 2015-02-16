package leetcode.addTwoNumbers;
import leetcode.common.ListNode;

/**
 * 
 * @author feiyu
 * @since December 31, 2014
 */
public class Solution {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
		ListNode n1 = l1;
		ListNode n2 = l2;
		ListNode next = new ListNode(Integer.MIN_VALUE);
		ListNode head = next;
		int carry = 0;
		while(n1 != null || n2 != null || carry >0){
			int v1 = (n1 == null) ? 0:n1.val;
			int v2 = (n2 == null) ? 0:n2.val;
			ListNode n = new ListNode((carry+v1+v2) % 10);
			next.next = n;
			carry = (carry+v1+v2 - n.val)/10;
			n1 = (n1 == null) ? null: n1.next;
			n2 = (n2 == null) ? null: n2.next;
			next = next.next;
		}
		
		return head.next;
		
	}
}
