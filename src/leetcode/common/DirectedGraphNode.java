package leetcode.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for directed graph node.
 * @author feiyu
 * @since May 6, 2015
 */
public class DirectedGraphNode {
	public int label;
	public List<DirectedGraphNode> neighbors;
	public DirectedGraphNode (int x) {
		label = x;
		neighbors = new ArrayList<DirectedGraphNode>();
	}
	
	public String toString(){
		return ""+label;
	}
}
