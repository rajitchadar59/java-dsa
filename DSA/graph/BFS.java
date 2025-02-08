import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class BFS {
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
   
   public static void bfs(ArrayList<edge> graph[] ,int v){
    Queue<Integer> q=new LinkedList<>();
    boolean visited[]=new boolean[v];
    q.add(0);
    while(!q.isEmpty()){
        int current =q.remove();
        if(visited[current]==false){
            System.out.print(current+" ");
            visited[current]=true;
            for(int i =0 ; i <graph[current].size() ; i++){
                edge e= graph[current].get(i);
                q.add(e.des);
            }
        }
    }

   }
    public static void main(String[] args) {
        int v=7;
        ArrayList<edge> graph[] = new ArrayList[v];
        create_graph(graph);
        bfs(graph, v); 
        
    }
} 











/*
        if graph is divided into subgraph like:
        1-->2---->3 component 1
        4-->5---->6 component 2
        
    

         */

/*


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class BFS {
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
   
   public static void bfs(ArrayList<edge> graph[] ,int v ,boolean visited[] ,int start){
    Queue<Integer> q=new LinkedList<>();
    
    q.add(start);
    while(!q.isEmpty()){
        int current =q.remove();
        if(visited[current]==false){
            System.out.print(current+" ");
            visited[current]=true;
            for(int i =0 ; i <graph[current].size() ; i++){
                edge e= graph[current].get(i);
                q.add(e.des);
            }
        }
    }

   }
    public static void main(String[] args) {
        int v=7;
        ArrayList<edge> graph[] = new ArrayList[v];
        create_graph(graph);
        boolean visited[]=new boolean[v];
        for(int i=0 ; i<v ;i++){
            if(visited[i]==false){
             bfs(graph, v ,visited ,i); 
            }
        }
       
        
    }
} 





*/
