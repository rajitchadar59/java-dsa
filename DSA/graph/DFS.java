import java.util.ArrayList;
public class DFS {
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
   graph[0].add(new edge(0,2));
   graph[1].add(new edge(1,0));
   graph[1].add(new edge(1,3));
   graph[2].add(new edge(2,0));
   graph[2].add(new edge(2,4));
   graph[3].add(new edge(3,1));
   graph[3].add(new edge(3,5));
   graph[3].add(new edge(3,4));
   graph[4].add(new edge(4,2));
   graph[4].add(new edge(4,3));
   graph[4].add(new edge(4,5));
   graph[5].add(new edge(5,4));
   graph[5].add(new edge(5,3));
   graph[5].add(new edge(5,6));


   }
   public static void dfs(ArrayList<edge> graph[] ,int current ,boolean visited[]){
    System.out.print(current+" ");
    visited[current]=true;
    for(int i =0 ; i<graph[current].size() ; i++){
    edge e=graph[current].get(i);
    if(visited[e.des]==false){
     dfs(graph ,e.des ,visited);
    }
       
    }
   }
 
    public static void main(String[] args) {
        int v=7;
        ArrayList<edge> graph[] = new ArrayList[v];
        create_graph(graph);
        boolean visited[]= new boolean[v];
        dfs(graph ,0 ,visited); 
       /*
       if graph is divided into components,
       so we use loop which we use in bfs 
       */ 
    }
} 