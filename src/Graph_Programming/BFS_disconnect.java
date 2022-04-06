package Graph_Programming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_disconnect {
    static void addEdge(ArrayList<ArrayList<Integer>> list, int u, int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }
    static void BFS(ArrayList<ArrayList<Integer>> list,int s,boolean visited[]){
        Queue<Integer> q=new LinkedList<>();
        visited[s]=true;
        q.add(s);
        while(!q.isEmpty()){
            int u=q.poll();
            System.out.print(u+" ");
            for(int val:list.get(u)){
                if(visited[val]==false){
                    visited[val]=true;
                    q.add(val);
                }
            }
        }
    }
    static void BFSDin(ArrayList<ArrayList<Integer>> adj,int V){
        boolean [] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                BFS(adj,i,visited);
            }
        }
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        addEdge(adj,4,5);
        addEdge(adj,5,6);
        addEdge(adj,4,6);

        System.out.println("Following is Breadth First Traversal: ");
        BFSDin(adj,V);
    }
}
