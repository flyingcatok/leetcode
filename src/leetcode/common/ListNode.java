package leetcode.common;

/**
 * Definition for singly-linked list.
 * @author feiyu
 * @since December 26, 2014
 */
public class ListNode {
	public int val;
	public ListNode next;
	
	public ListNode(int x) {
		val = x;
		next = null;
	}
	
	public String toString(){
		if(next!=null){
			return val+"->"+next.toString();
		}else{
			return val+"";
		}
		
	}
}
