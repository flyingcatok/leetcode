package lintcode.topologicalSort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import leetcode.common.DirectedGraphNode;

/**
 * find a node with indgree = 0, then add it to result and delete from graph. repeat the process.
 * @author feiyu
 * @since May 6, 2015
 */
public class Solution {
	public static ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {  
		// write your code here
		ArrayList<DirectedGraphNode> result = new ArrayList<>();
		HashMap<DirectedGraphNode, Integer> map = new HashMap<>();
		// fill out map node: indegree
		for (DirectedGraphNode node : graph) {
			for (DirectedGraphNode neighbor : node.neighbors) {
				if (map.containsKey(neighbor)) {
					map.put(neighbor, map.get(neighbor)+1);
				} else {
					map.put(neighbor, 1);
				}
			}
		}
		Queue<DirectedGraphNode> q = new LinkedList<>();
		// add node with 0 indegree to the result
		for(DirectedGraphNode node: graph){
			if (!map.containsKey(node)){
				result.add(node);
				q.offer(node);
			}
		}
		while(!q.isEmpty()) {
			DirectedGraphNode node = q.poll();
			// delete node
			for (DirectedGraphNode neighbor: node.neighbors) {
				map.put(neighbor, map.get(neighbor)-1);
				if(map.get(neighbor)==0) {
					result.add(neighbor);
					q.offer(neighbor);
				}
			}
        
		}
		return result;
	}
}
