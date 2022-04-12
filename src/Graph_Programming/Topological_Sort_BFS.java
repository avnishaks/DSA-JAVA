package Graph_Programming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_Sort_BFS {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){
        adj.get(u).add(v);
    }
    public static void topologicalSort(ArrayList<ArrayList<Integer>> adj,int V){
        int [] indegree=new int[V];

        // Finding the in-degree of the every vertex.
        for(int i=0;i<V;i++){
            for(var x:adj.get(i)){
                indegree[x]++;
            }
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        while (!q.isEmpty()){
            int x=q.poll();
            System.out.printf(x+"  ");
            for(var v:adj.get(x)){
                if(--indegree[v]==0){
                    q.add(v);
                }
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0, 2);
        addEdge(adj,0, 3);
        addEdge(adj,1, 3);
        addEdge(adj,1, 4);
        addEdge(adj,2, 3);

        System.out.println("Following is a Topological Sort of");
        topologicalSort(adj,V);
    }
}
