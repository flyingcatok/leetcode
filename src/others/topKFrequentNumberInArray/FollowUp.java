package others.topKFrequentNumberInArray;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Top k frequent elements in a sorted data Stream?
 * without hash map
 * @author feiyu
 * @since April 4, 2015
 */
public class FollowUp {
	static List<Integer> stream = new LinkedList<>();
	static int k = 3;
	static int count;
	static int prev = Integer.MIN_VALUE;
	static HashMap<Integer, Integer> hashmap = new HashMap<>();
	static PriorityQueue<Node> heap = new PriorityQueue<>(k,
			new Comparator<Node>() {

		@Override
		public int compare(Node o1, Node o2) {
			return o2.count - o1.count;
		}

});
	private static void printList(List<Integer> list) {
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
	}
	
	static class Node {
		int number;
		int count;
		public Node(int n, int c){
			number = n;
			count = c;
		}
		public Node(int n){
			number = n;
			count = 1;
		}
		public boolean equals(Object o){
			if(o == this){
				return true;
			}
			if(!(o instanceof Node)){
				return false;
			}
			Node node = (Node)o;
			return this.number == node.number;
		}
	}
	
	public static List<Integer> findTopKFrequent(int element) {
		FollowUp.stream.add(element);
		List<Integer> result = new LinkedList<>();
		// use prev and count to track frequency of sorted data stream elements
		count = prev == element ? count + 1:1;
		prev = element;
		// if element is already in the queue, remove it and recalculate frequency
		heap.remove(new Node(element));
		// might as well use hash map
//		if (!hashmap.containsKey(element)){
//			hashmap.put(element, 1);
//		} else{
//			hashmap.put(element, hashmap.get(element) + 1);
//		}
		
		// add element in the priority queue
//		heap.add(new Node(element, hashmap.get(element)));
		heap.add(new Node(element, count));
		PriorityQueue<Node> temp = new PriorityQueue<>(heap);
		
		int kk = Math.min(k, temp.size());
		while(kk-- > 0){
			result.add(temp.poll().number);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		List<Integer> result = new LinkedList<>();
		result.add(1);result.add(1);
		result.add(2);result.add(2);result.add(2);
		result.add(3);
		result.add(4);result.add(4);result.add(4);result.add(4);
		result.add(5);
		
		Iterator<Integer> itr = result.iterator();
		
		while(itr.hasNext()){
			int element = itr.next();
			System.out.print("next element: " + element + "  ");System.out.print("Top " + k +" frequent: ");
			printList(findTopKFrequent(element));
		}
//		System.out.println("stream: ");printList(stream);
	}

}
