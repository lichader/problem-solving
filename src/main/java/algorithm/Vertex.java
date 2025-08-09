package algorithm;

import java.util.LinkedList;
import java.util.List;

final class Vertex {
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
