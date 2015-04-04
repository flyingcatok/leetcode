package leetcode.mergeKSortedLists;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import leetcode.common.ListNode;

/**
 * use heap
 * @author feiyu
 * @since April 4, 2015
 */
public class Solution {
    public static ListNode mergeKLists(List<ListNode> lists) {
        if (lists == null || lists.size() == 0) {
            return null;
        }
        
        PriorityQueue<ListNode> heap = new PriorityQueue<>(10,
        		new Comparator<ListNode>() {
        		@Override
                public int compare(ListNode o1, ListNode o2) {
                    return o1.val - o2.val;
                }
            });
            
        for (int i = 0; i < lists.size(); i++) {
            ListNode temp = lists.get(i);
            if(temp != null) {
                heap.offer(temp);
            }
        }
        ListNode result = new ListNode(-1);
        ListNode curr = result;
        
        while(heap.size() > 0){
        	ListNode temp = heap.poll();
        	curr.next = temp;
        	curr = curr.next;
        	if(temp.next != null){
        		heap.offer(temp.next);
        	}
        }
        return result.next;
    }
}
