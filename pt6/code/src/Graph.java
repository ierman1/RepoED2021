import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Graph {
    public static final double INFINITY = Double.MAX_VALUE;
    private HashMap<String, Vertex> vertexMap;

    public Graph() {
        this.vertexMap = new HashMap<>();
    }

    public void addEdge(String sourceName, String destName, double cost)
    {
        Vertex v = getVertex(sourceName);
        Vertex w = getVertex(destName);
        v.adj.add(new Edge(w, cost));
    }
    public void printPath(String destName)
    {
        Vertex w = vertexMap.get(destName);
        if (w == null)
            System.out.println("Error");
        else if (w.dist == INFINITY)
            System.out.println("Path does not exist");
        else
        {
            System.out.print("Cost is: " + w.dist);
            printPath(w);
            System.out.println();
        }
    }
    public void dijkstra(String startName)
    {
        // PriorityQueue<Path> pq = new PriorityQueue<Path>();
        Vertex[] V = new Vertex[vertexMap.size()];
        HashMap<String, Double> dists = new HashMap<>();
        int i = 0;

        for (Map.Entry<String, Vertex> v : vertexMap.entrySet()) {
            dists.put(v.getValue().name, INFINITY);
        }

        Vertex v = getVertex(startName);
        dists.put(v.name, 0d);

        while (i != vertexMap.size()) {

            V[i] = v;
            double tmp = 0;

            for (Edge e : v.adj) {
                tmp = dists.get(v.name) + e.cost;
                if (tmp < dists.get(e.dest.name)) {
                    dists.put(e.dest.name, tmp);
                    e.dest.prev = v;
                }
            }

            tmp = INFINITY;

            for (Map.Entry<String, Double> d : dists.entrySet()) {
                if (d.getValue() != 0 && d.getValue() < tmp) {
                    tmp = d.getValue();
                    v = vertexMap.get(d.getKey());
                }
            }

            i++;
        }

    }
    private Vertex getVertex(String vertexName){
        Vertex v = vertexMap.get(vertexName);

        if (v == null) {
            v = new Vertex(vertexName, 0);
            vertexMap.put(vertexName, v);
        }

        return v;
    }
    private void printPath(Vertex dest){
        if (dest.prev != null)
        {
            printPath(dest.prev);
            System.out.print(" to ");
        }
        System.out.print(dest.name);
    }
    private void clearAll()
    {
        for (Vertex v : vertexMap.values())
            v.reset();
    }
}
