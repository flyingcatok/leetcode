package leetcode.sortList;

import leetcode.common.ListNode;

/**
 * merge sort
 * @author feiyu
 * @since March 8, 2015
 */
public class Solution {
	public static ListNode sortList(ListNode head) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            return head;
        }
        // left-half list end
        ListNode leftEnd = new ListNode(-1);
        leftEnd.next = head;
        ListNode rightStart = head;
        ListNode faster = head;
        while(faster != null){
            leftEnd = leftEnd.next;
            rightStart = rightStart.next;
            faster = faster.next;
            if(faster != null){
                faster = faster.next;
            }
        }
        // break list into 2 halves: left & right
        leftEnd.next = null;
        ListNode sortedLeft = sortList(head);
        ListNode sortedRight = sortList(rightStart);
        return merge(sortedLeft, sortedRight);
	}
	
	/**
	 * copy from leetcode.mergeTwoSortedLists
	 * @param l1 list 1
	 * @param l2 list 2
	 * @return merged list
	 */
	private static ListNode merge(ListNode l1, ListNode l2){
		if(l1 == null){
			return l2;
		}
		if(l2 == null){ // l1 != null
			return l1;
		}

		// l1 != null && l2 != null
		ListNode head = new ListNode(Integer.MIN_VALUE), curr = head;
		// curr: last node of merged list
		while(l1 != null || l2 != null){
			if(l1 ==null){
				curr.next = l2;
				break;
			}
			if(l2 == null){
				curr.next = l1;
				break;
			}
			if(l1.val <l2.val){
				curr.next = l1;
				l1 = l1.next;
				curr = curr.next;
			}else{
				curr.next = l2;
				l2=l2.next;
				curr = curr.next;
			}
		}
		
		return head.next;

	}
}
