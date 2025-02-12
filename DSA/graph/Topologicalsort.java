import java.util.ArrayList;
import java.util.Stack;
public class Topologicalsort {
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
   

   graph[2].add(new edge(2,3));
   graph[3].add(new edge(3,1));
   graph[4].add(new edge(4,0));
   graph[4].add(new edge(4,1));

   graph[5].add(new edge(5,2));



   }
   public static void topological_sort(ArrayList<edge> graph[] ,int current ,boolean visited[] ,Stack<Integer> s){
    visited[current]=true;
    for(int i =0 ; i<graph[current].size() ; i++){
    edge e=graph[current].get(i);
    if(visited[e.des]==false){
     topological_sort(graph, e.des, visited, s);
    }  
    }
    s.push(current);

   }
 public static void printtopo(ArrayList<edge> graph[] ,int v){
      Stack<Integer> s= new Stack<>();
       
        boolean visited[]= new boolean[v];
        for(int i =0 ; i<v ; i++){
            if(!visited[i]){
                topological_sort(graph, i, visited, s);
            }
        }
      
      while(!s.isEmpty()){
        System.out.print(s.pop()+" ");
      }
 }
    public static void main(String[] args) {
        int v=6;
        ArrayList<edge> graph[] = new ArrayList[v];
        create_graph(graph);
        printtopo(graph, v);
    }
} 