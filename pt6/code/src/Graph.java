import java.util.*;

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
        PriorityQueue<Path> pq = new PriorityQueue<Path>();
        HashMap<String, Double> dists = new HashMap<>();
        List<String> visited = new ArrayList<>();

        for (Map.Entry<String, Vertex> v : vertexMap.entrySet())
            dists.put(v.getValue().name, INFINITY);

        Vertex v = getVertex(startName);
        dists.put(v.name, 0d);
        pq.add(new Path(v, 0d));

        while (!pq.isEmpty() && visited.size() != vertexMap.size()) {

            v = pq.poll().dest;
            visited.add(v.name);
            double tmp;

            for (Edge e : v.adj) {
                tmp = Math.min(dists.get(e.dest.name), dists.get(v.name) + e.cost);
                dists.put(e.dest.name, tmp);
                vertexMap.get(e.dest.name).dist = tmp;
                if (!visited.contains(e.dest.name))
                    pq.add(new Path(vertexMap.get(e.dest.name), tmp));
            }

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
