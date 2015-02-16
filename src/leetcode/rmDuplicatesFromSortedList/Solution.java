package leetcode.rmDuplicatesFromSortedList;

import leetcode.common.ListNode;
/**
 * two pointers
 * @author feiyu
 * @since January 2, 2015
 */
public class Solution {
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode p1 = head;
		ListNode p2 = p1;
		
		while(p2 != null){
			if(p1.val < p2.val){
				if(!p1.next.equals(p2)){
					p1.next = p2;
				}
				p1 = p2;
				p2 = p2.next;
			}else{
				p2 = p2.next;
			}
		}
		if(p1!=null){
			p1.next = null;
		}
		return head;
        
    }
}
