package algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    public static void main(String[] args) {
        var v0 = new Vertex(0);
        var v1 = new Vertex(1);
        var v2 = new Vertex(2);
        var v3 = new Vertex(3);
        var v4 = new Vertex(4);
        var v5 = new Vertex(5);
        var v6 = new Vertex(6);
        var v7 = new Vertex(7);
        var v8 = new Vertex(8);

        v0.getNeighbors().addAll(Arrays.asList(v1, v5, v6));
        v1.getNeighbors().addAll(Arrays.asList(v3, v4, v5));
        v4.getNeighbors().addAll(Arrays.asList(v2, v6));
        v6.getNeighbors().addAll(Arrays.asList(v0, v7));
        v7.getNeighbors().add(v8);

        var dfs = new DepthFirstSearch();
        dfs.traverse(v0);
    }

    void traverse(Vertex start) {
        var stack = new Stack<Vertex>();
        stack.push(start);

        while (!stack.isEmpty()) {
            var node = stack.pop();

            if (!node.isVisited()) {
                System.out.println("Visiting vertex: " + node.getValue());
                node.setVisited(true);
                stack.addAll(node.getNeighbors());
            }
        }
    }

    static final class Vertex {
        private final int value;
        private boolean visited = false;
        private final List<Vertex> neighbors = new LinkedList<>();


        public Vertex(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public boolean isVisited() {
            return visited;
        }

        public void setVisited(boolean visited) {
            this.visited = visited;
        }

        public List<Vertex> getNeighbors() {
            return neighbors;
        }
    }

}

