package Graph_Programming;

import java.util.ArrayList;

public class DFS_imp {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    static void DFSRec(ArrayList<ArrayList<Integer>> adj,int s,boolean [] visit){
        visit[s]=true;
        System.out.print(s+" ");
        for(int val:adj.get(s)){
            if(visit[val]==false){
                DFSRec(adj,val,visit);
            }
        }
    }
    static void DFS(ArrayList<ArrayList<Integer>> adj,int V,int s){
        boolean [] visit=new boolean[V];
        DFSRec(adj,s,visit);
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,2,3);
        addEdge(adj,1,3);
        addEdge(adj,1,4);
        addEdge(adj,3,4);

        System.out.println("Following is Depth First Traversal: ");
        DFS(adj,V,0);
    }
}
