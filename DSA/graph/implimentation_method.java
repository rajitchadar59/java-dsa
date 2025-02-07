import java.util.ArrayList;
public class implimentation_method {
   static class edge{
    int src;
    int des;
    public edge(int s , int d){
        this.src=s;
        this.des=d;

    }
   }
   public static void create_graph(ArrayList<edge> graph[]){
   for(int i =0 ; i<graph.length ; i++){
    graph[i]=new ArrayList<>();
   }
   graph[0].add(new edge(0,1));
   graph[1].add(new edge(1,2));
   graph[1].add(new edge(1,3));
   graph[2].add(new edge(2,0));
   graph[2].add(new edge(2,1));
   graph[2].add(new edge(2,3));
   graph[3].add(new edge(3,1));
   graph[3].add(new edge(3,2));
   }
    public static void main(String[] args) {
        int v=10;
        ArrayList<edge> graph[] = new ArrayList[v];
        System.out.println(graph);

    }
} 