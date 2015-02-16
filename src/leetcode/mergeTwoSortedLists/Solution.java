package leetcode.mergeTwoSortedLists;
import leetcode.common.ListNode;

/**
 * 
 * @author feiyu
 * @since December 31, 2014
 */
public class Solution {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null){
			return l2;
		}
		if(l2 == null){ // l1 != null
			return l1;
		}
		
		// l1 != null && l2 != null
		ListNode head = new ListNode(Integer.MIN_VALUE), next = head;
		while(l1 != null || l2 != null){
			if(l1 ==null){
				next.next = l2;
				break;
			}
			if(l2 == null){
				next.next = l1;
				break;
			}
			if(l1.val <l2.val){
				next.next = l1;
				l1 = l1.next;
				next = next.next;
			}else{
				next.next = l2;
				l2=l2.next;
				next = next.next;
			}
		}
		
		return head.next;
        
    }
}
