package lintcode.topologicalSort;

import java.util.ArrayList;

import leetcode.common.DirectedGraphNode;

/**
 * Given an directed graph, a topological order of the graph nodes is defined as follows:
 * 1. For each directed edge A-->B in graph, A must before B in the order list.
 * 2. The first node in the order can be any node in the graph with no nodes direct to it.
 * Find any topological order for the given graph.
 * You can assume that there is at least one topological order in the graph.
 * @author feiyu
 * @since May 6, 2015
 */
public class Problem {

	public static void main(String[] args) {
		DirectedGraphNode node1 = new DirectedGraphNode(0);
		DirectedGraphNode node2 = new DirectedGraphNode(1);
		DirectedGraphNode node3 = new DirectedGraphNode(2);
		DirectedGraphNode node4 = new DirectedGraphNode(3);
		node1.neighbors.add(node2);
		node1.neighbors.add(node3);
		node1.neighbors.add(node4);
		DirectedGraphNode node5 = new DirectedGraphNode(4);
		DirectedGraphNode node6 = new DirectedGraphNode(5);
		node2.neighbors.add(node5);
		node3.neighbors.add(node5);
		node3.neighbors.add(node6);
		node4.neighbors.add(node5);
		node5.neighbors.add(node6);
		ArrayList<DirectedGraphNode> input = new ArrayList<>();
		input.add(node6);
		input.add(node5);
		input.add(node4);
		input.add(node3);
		input.add(node2);
		input.add(node1);
		ArrayList<DirectedGraphNode> result = Solution.topSort(input);
		System.out.println(result);
	}

}
