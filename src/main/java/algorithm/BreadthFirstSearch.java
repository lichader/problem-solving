package algorithm;

import java.util.Arrays;
import java.util.LinkedList;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        var v0 = new Vertex(0);
        var v1 = new Vertex(1);
        var v2 = new Vertex(2);
        var v3 = new Vertex(3);
        var v4 = new Vertex(4);
        var v5 = new Vertex(5);
        var v6 = new Vertex(6);

        v0.getNeighbors().addAll(Arrays.asList(v1,v5,v6));
        v1.getNeighbors().addAll(Arrays.asList(v3, v4, v5));
        v4.getNeighbors().addAll(Arrays.asList(v2, v6));
        v6.getNeighbors().add(v0);

        var algorithm = new Algorithm();
        algorithm.traverse(v0);
    }

    private static class Algorithm {

        public void traverse(Vertex start) {
            var queue = new LinkedList<Vertex>();

            queue.push(start);

            while(!queue.isEmpty()){
                var node = queue.pop();

                if (!node.isVisited()){
                    System.out.println("Visiting vertex: " + node.getValue());
                    node.setVisited(true);
                    node.getNeighbors().forEach(queue::push);
                }
            }
        }

    }
}


