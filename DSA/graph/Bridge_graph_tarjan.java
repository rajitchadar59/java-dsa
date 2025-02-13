
import java.util.ArrayList;

public class Bridge_graph_tarjan {

    static class edge {

        int src;
        int des;

        public edge(int s, int d) {
            this.src = s;
            this.des = d;

        }
    }

    public static void create_graph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));
        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));
        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));
        graph[3].add(new edge(3, 0));
        graph[3].add(new edge(3, 4));
        graph[3].add(new edge(3, 5));
        graph[4].add(new edge(4, 3));
        graph[4].add(new edge(4, 5));
        graph[5].add(new edge(5, 3));
        graph[5].add(new edge(5, 4));

    }

    public static void dfs(ArrayList<edge> graph[], int curr, boolean visited[], int dt[], int low[], int time, int parent) {
        visited[curr] = true;
        dt[curr] = low[curr] = ++time;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (e.des == parent) {
                continue;
            } 
            else if (!visited[e.des]) {
                dfs(graph, e.des, visited, dt, low, time, curr);
                low[curr] = Math.min(low[curr], low[e.des]);
                if (dt[curr] < low[e.des]) {
                    System.out.println("bridge is :" + curr + "---------" + e.des);
                } 
            }
            else {
                    low[curr] = Math.min(low[curr], dt[e.des]);
                }

        }
    }

    public static void getbridge(ArrayList<edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(graph, i, visited, dt, low, time, -1);
            }
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        create_graph(graph);
        getbridge(graph, v);
    }
}
