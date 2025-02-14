import java.util.ArrayList;

public class acuumulation_point_tarjan_algo {
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
   graph[0].add(new edge(0,3));
   graph[1].add(new edge(1,0));
   graph[1].add(new edge(1,2));
   graph[2].add(new edge(2,0));
   graph[2].add(new edge(2,1));
   graph[3].add(new edge(3,0));
   graph[3].add(new edge(3,4));
   graph[4].add(new edge(4,3));



   }

 public static void dfs(ArrayList<edge> graph[] ,int curr,int p,int dt[] ,int low[] ,int time ,boolean visited[] ,boolean ap[]){
    visited[curr]=true;
    dt[curr] = low[curr] = ++time;
    int children=0;

    for(int i =0 ; i <graph[curr].size() ;i++){
        edge e= graph[curr].get(i);
        
        if(e.des==p){
            continue;
        }
        else if(visited[e.des]){
           low[curr]= Math.min(low[curr] ,dt[e.des]);
        }
        else{
            dfs(graph, e.des, curr, dt, low, time, visited, ap);
             low[curr]= Math.min(low[curr] ,low[e.des]);
             if(dt[curr] <= low[e.des] &&p!=-1){
                ap[curr]=true;
             }
             children++;
        }

    }

    if(p==-1 && children > 1){
        ap[curr]=true;
    }
 }
   
 public static void getAp( ArrayList<edge> graph[] ,int V){
    int dt[]= new int[V];
    int low[]=new int[V];
    int time=0;
    boolean visited[]= new boolean[V];
    boolean ap[]=new boolean[V];
    for(int i =0 ; i<V;i++){
        if(!visited[i]){
            dfs(graph, i, -1, dt, low, time, visited, ap);
        }
    }
    for(int i =0 ; i<V ;i++){
      if(ap[i]==true){
        System.out.println("articulation point is :"+i);
      }  
    }
 }
    public static void main(String[] args) {
        int v=5;
        ArrayList<edge> graph[] = new ArrayList[v];
        create_graph(graph);
        getAp(graph, v);
        
    }
} 


