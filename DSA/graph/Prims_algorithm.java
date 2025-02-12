
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims_algorithm {

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

    public static class Pair implements Comparable<Pair> {

        int node;
        int cost;

        public Pair(int n, int c) {
            this.cost = c;
            this.node = n;

        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;//assending sorted order will come  
        }

    }

    public static void create_graph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 1, 10));
        graph[0].add(new edge(0, 2, 15));
        graph[0].add(new edge(0, 3, 30));
        graph[1].add(new edge(1, 0, 10));
        graph[1].add(new edge(1, 3, 40));
        graph[2].add(new edge(2, 0, 15));
        graph[2].add(new edge(2, 3, 50));
        graph[3].add(new edge(3, 1, 40));
        graph[3].add(new edge(3, 2, 50));
    }

    public static void primsalgo(ArrayList<edge> graph[], int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean visited[] = new boolean[V];
        pq.add(new Pair(0, 0));
        int mincost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!visited[curr.node]) {
                visited[curr.node] = true;
                mincost += curr.cost; 

                for (int i = 0; i < graph[curr.node].size(); i++) {
                    edge e = graph[curr.node].get(i);
                    if (!visited[e.des]) {
                        pq.add(new Pair(e.des, e.wt));
                    }
                }

            }
        }
        System.out.println("minimum cost is:"+mincost);
    }

    public static void main(String[] args) {
        int v = 10;
        ArrayList<edge> graph[] = new ArrayList[v];
        create_graph(graph);
        primsalgo(graph, v);
    }
}
  