package Graph;
import java.util.*;


public class GraphDSA {
  public static void main(String[] args){
    int n = 3;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    for(int i=0;i<=n;i++)
      adj.add(new ArrayList<Integer>());

    adj.get(0).add(1);
    adj.get(1).add(0);

    adj.get(1).add(2);
    adj.get(2).add(1);

    adj.get(2).add(3);
    adj.get(3).add(2);
    
    for(int i=0;i<=n;i++){
      System.out.print(i+"->");
      for(Integer it: adj.get(i)){
        System.out.print(it+" ");
      }

      System.out.println();
    }
    System.out.println("BFS Traversal is : ");
    bfs(0,adj,n+1);

    System.out.println("\nDFS Traversal is : ");
    boolean[] visited = new boolean[n+1];

    dfs(0,visited,adj);
  }

  static void bfs(int start, ArrayList<ArrayList<Integer>> adj, int n){
    boolean[] visited = new boolean[n];
    Queue<Integer> q = new LinkedList<>();

    visited[start]=true;
    q.add(start);

    while(!q.isEmpty()){
      int node = q.poll();
      System.out.print(node+" ");

      for(int neighour:adj.get(node)){
        if(!visited[neighour]){
          visited[neighour]=true;
          q.add(neighour);
        }
      }
    }
   }

   static void dfs(int node , boolean[] visited, ArrayList<ArrayList<Integer>>adj){
    visited[node] = true;
    System.out.print(node + " ");

    for(int neigh : adj.get(node)) {
        if(!visited[neigh]) {
            dfs(neigh, visited, adj);
        }
    }
   }
}

