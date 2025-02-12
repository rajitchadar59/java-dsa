import java.util.ArrayList;
import java.util.Stack;

public class Kosaraju_algorithm {
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

        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));
        graph[1].add(new edge(1, 0));
        graph[2].add(new edge(2, 1));
        graph[3].add(new edge(3, 4));
    }

    public static void dfs(ArrayList<edge> graph[], int curr, boolean visited[]) {
        visited[curr] = true;
        System.out.print(curr + " ");
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (!visited[e.des]) {
                dfs(graph, e.des, visited);
            }
        }
    }

    public static void topological_sort(ArrayList<edge> graph[], int current, boolean visited[], Stack<Integer> s) {
        visited[current] = true;
        for (int i = 0; i < graph[current].size(); i++) {
            edge e = graph[current].get(i);
            if (!visited[e.des]) {
                topological_sort(graph, e.des, visited, s);
            }
        }
        s.push(current);
    }

    public static void kosaraju_algo(ArrayList<edge> graph[], int V) {
        // Step 1: Perform topological sort
        Stack<Integer> s = new Stack<>();
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topological_sort(graph, i, visited, s);
            }
        }

        // Step 2: Create transpose graph
        ArrayList<edge> transgraph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            transgraph[i] = new ArrayList<>();
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                edge e = graph[i].get(j);
                transgraph[e.des].add(new edge(e.des, e.src));
            }
        }

        // Step 3: Perform DFS on transpose graph in the order defined by the stack
        boolean newvis[] = new boolean[V];
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!newvis[curr]) {
                dfs(transgraph, curr, newvis);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        create_graph(graph);
        kosaraju_algo(graph, v);
    }
}