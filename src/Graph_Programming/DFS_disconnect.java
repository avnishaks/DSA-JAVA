package Graph_Programming;

import java.util.ArrayList;

public class DFS_disconnect {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
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
    static void DFS(ArrayList<ArrayList<Integer>> adj,int V){
        boolean [] visit=new boolean[V];
        for(int i=0;i<V;i++){
            if(visit[i]==false){
                DFSRec(adj,i,visit);
            }
        }

    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,3,4);

        System.out.println("Following is Depth First Traversal for disconnected graphs: ");
        DFS(adj,V);
    }
}
