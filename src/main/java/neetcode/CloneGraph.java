package neetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://neetcode.io/problems/clone-graph
 */
public class CloneGraph {

    public Node cloneGraph(Node node) {
        return new Node(1);
    }
}

class Node {
    public final int val;
    public final List<Node> neighbors = new ArrayList<>();

    public Node(int val) {
        this.val = val;
    }
}
