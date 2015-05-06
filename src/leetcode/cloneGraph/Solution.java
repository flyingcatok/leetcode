package leetcode.cloneGraph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import leetcode.common.UndirectedGraphNode;

/**
 * use hashmap to map origin node to clone node. first pass to clone node. second pass to clone edges.
 * @author feiyu
 * @since May 6, 2015
 */
public class Solution {
	public static UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null){
            return null;
        }
        Queue<UndirectedGraphNode> q = new LinkedList<>();
        q.offer(node);
        HashMap<UndirectedGraphNode,UndirectedGraphNode> hash = new HashMap<>();
        hash.put(node, new UndirectedGraphNode(node.label));
        
        while (!q.isEmpty()) {
            UndirectedGraphNode nd = q.poll();
            UndirectedGraphNode clone = new UndirectedGraphNode(nd.label);
            hash.put(nd, clone);
            for (UndirectedGraphNode n: nd.neighbors) {
                if (!hash.containsKey(n))
                    q.offer(n);
            }
        }
        Set<Map.Entry<UndirectedGraphNode,UndirectedGraphNode>> entry = hash.entrySet();
        for (Map.Entry<UndirectedGraphNode,UndirectedGraphNode> e: entry) {
            UndirectedGraphNode key = e.getKey();
            UndirectedGraphNode value = e.getValue();
            for (UndirectedGraphNode n : key.neighbors) {
                value.neighbors.add(hash.get(n));
            }
        }
        return hash.get(node);
    }
}
