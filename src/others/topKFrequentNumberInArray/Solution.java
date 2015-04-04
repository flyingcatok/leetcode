package others.topKFrequentNumberInArray;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * priority queue, hash table
 * @author feiyu
 * @since April 4, 2015
 */
public class Solution {
	
	public static int[] findTopKFrequent(int [] array, int k){
		if(array == null || k < 1) {
			return null;
		}
		int[] result = new int[k];
		Map<Integer, Integer> hashmap = new HashMap<>();
		// build hash map
		for (int i = 0; i < array.length; i++) {
			if(!hashmap.containsKey(array[i])){
				hashmap.put(array[i], 1);
			} else {
				hashmap.put(array[i], hashmap.get(array[i]) + 1);
			}
		}
		// build priority queue
		class Node {
			int number;
			int count;
			public Node(int number, int count) {
				this.number = number;
				this.count = count;
			}
		}

		PriorityQueue<Node> heap = new PriorityQueue<>(hashmap.size(), 
				new Comparator<Node>() {
					public int compare(Node o1, Node o2) {
						return o2.count - o1.count;
					}
		});
		for (Map.Entry<Integer, Integer> e : hashmap.entrySet()) {
			heap.offer(new Node(e.getKey(), e.getValue()));
		}
		// return first k elements in priority queue
		for(int i = 0; i < Math.min(k, hashmap.entrySet().size()); i++){
			result[i] = heap.poll().number;
		}
		
		return result;
	}
}
