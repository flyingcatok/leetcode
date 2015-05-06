package leetcode.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition of undirected graph node.
 * @author feiyu
 * @since May 6, 2015
 */
public class UndirectedGraphNode {
	public int label;
	public List<UndirectedGraphNode> neighbors;
	public UndirectedGraphNode (int x) {
		label = x;
		neighbors = new ArrayList<UndirectedGraphNode>();
	}
}
