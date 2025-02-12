import java.util.ArrayList;
public class undirected_weighted_imp {
   static class edge{
    int src;
    int des;
    int wt;
    public edge(int s , int d ,int w){
        this.src=s;
        this.des=d;
        this.wt=w;
    }
   }
   public static void create_graph(ArrayList<edge> graph[]){
   for(int i =0 ; i<graph.length ; i++){
    graph[i]=new ArrayList<>();
   }
   graph[0].add(new edge(0,2,2));
   graph[1].add(new edge(1,2,10));
   graph[1].add(new edge(1,3,0));
   graph[2].add(new edge(2,0,2));
   graph[2].add(new edge(2,1,10));
   graph[2].add(new edge(2,3,-1));
   graph[3].add(new edge(3,1,0));
   graph[3].add(new edge(3,2,-1));
   }
    public static void main(String[] args) {
        int v=4;
        ArrayList<edge> graph[] = new ArrayList[v];
        create_graph(graph);
       //print 2's neighbour
       for(int i=0 ; i<graph[2].size() ;i++){
        edge e=graph[2].get(i);
        System.out.println(e.des+" , "+e.wt);
       }

    }
} 