import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Vertex {
    public String name;
    public HashSet<Edge> adj;
    public double dist;
    public Vertex prev;

    public Vertex(String name, double dist) {
        this.name = name;
        this.dist = dist;
        this.adj = new HashSet<>();
    }

    public void reset() {

    }
}
