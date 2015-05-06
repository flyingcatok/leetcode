package leetcode.cloneGraph;

import leetcode.common.UndirectedGraphNode;

/**
 * Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.
 * @author feiyu
 * @since May 6, 2015
 */
public class Problem133 {

	public static void main(String[] args) {
		UndirectedGraphNode node = new UndirectedGraphNode(0);
		UndirectedGraphNode node1 = new UndirectedGraphNode(1);
		node.neighbors.add(node);
		node.neighbors.add(node);
		node.neighbors.add(node1);
		UndirectedGraphNode clone = Solution.cloneGraph(node);
		System.out.println();
	}

}
