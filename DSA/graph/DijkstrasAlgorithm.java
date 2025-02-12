import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstrasAlgorithm {
    static class edge {
        int src;
        int des;
        int wt;

        public edge(int s, int d, int w) {
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }

    public static void create_graph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 1, 2));
        graph[0].add(new edge(0, 2, 4));
        graph[1].add(new edge(1, 2, 1));
        graph[1].add(new edge(1, 3, 7));
        graph[2].add(new edge(2, 4, 3));
        graph[3].add(new edge(3, 5, 1));
        graph[4].add(new edge(4, 3, 2));
        graph[4].add(new edge(4, 5, 5));
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int distence;

        public Pair(int node, int d) {
            this.node = node;
            this.distence = d;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.distence - p2.distence;
        }
    }

    public static void dijkstras_algo(ArrayList<edge> graph[], int src, int v) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dis[] = new int[v];
        boolean visited[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (i != src) {
                dis[i] = Integer.MAX_VALUE;
            }
        }
        pq.add(new Pair(src, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.remove(); // shortest distance
            if (!visited[curr.node]) {
                visited[curr.node] = true;

                for (int i = 0; i < graph[curr.node].size(); i++) {
                    edge e = graph[curr.node].get(i);
                    int U = e.src;
                    int V = e.des;
                    if (dis[U] + e.wt < dis[V]) { // relaxation
                        dis[V] = dis[U] + e.wt;
                        pq.add(new Pair(V, dis[V]));
                    }
                }
            }
        }

        // Print the shortest distances
        for (int i = 0; i < v; i++) {
            System.out.println("Distance from source " + src + " to node " + i + " is " + dis[i]);
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        create_graph(graph);
        dijkstras_algo(graph, 0, v);
    }
}