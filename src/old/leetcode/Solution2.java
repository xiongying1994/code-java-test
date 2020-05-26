package old.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 图  的 复制方法
 *
 * Map存放已经复制的顶点信息
 */
public class Solution2 {
    Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        Node clone = new Node(node.val, new ArrayList<Node>());
        map.put(node, clone);
        //邻居节点
        for (Node neighbor :node.neighbors) {
            //如果邻居节点在map中没有
            if (!map.containsKey(neighbor)) {
                Node newNeighbor = cloneGraph(neighbor);
                clone.neighbors.add(newNeighbor);
            } else {
                clone.neighbors.add(map.get(neighbor));
            }
        }

        return clone;
    }
}
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setNeighbors(List<Node> neighbors) {
        this.neighbors = neighbors;
    }
};
