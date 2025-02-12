
import java.util.ArrayList;

public class Bellman_ford_algo {

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
        graph[1].add(new edge(1, 2, -4));
        graph[2].add(new edge(2, 3, 2));
        graph[3].add(new edge(3, 4, 4));
        graph[4].add(new edge(4, 1, -1));

    }

    public static void bellmanford(ArrayList<edge> graph[], int src, int v) {
        int dis[] = new int[v];
        for (int i = 0; i < v; i++) {
            if (i != src) {
                dis[i] = Integer.MAX_VALUE;

            }
        }

        for (int k = 0; k < v - 1; k++) {

            for (int i = 0; i < v; i++) {
                for (int j = 0; j < graph[i].size(); j++) {
                    edge e = graph[i].get(j);
                    int U = e.src;
                    int V = e.des;
                    /*dis[U] !=Integer.MAX_VALUE ye condition isliye lagai kyonki java main infinity + some value negative ho jati hai
        to bo hamesha hi small hogi isliye hum ye lagate hai taki code sahi chale 
        or dis[U] se hokre konsa koi path  small jayega bo to infinity hi hoga 
        ek tarah se to hum isliye hi ye laga dete hain ...*/
                    if (dis[U] != Integer.MAX_VALUE && dis[U] + e.wt < dis[V]) {
                        dis[V] = dis[U] + e.wt;

                    }

                }

            }

        }
      

      for(int i =0 ; i<dis.length ;i++){
        System.out.print(dis[i]+" ");
      }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        create_graph(graph);
        bellmanford(graph, 0, v);
    }
}
