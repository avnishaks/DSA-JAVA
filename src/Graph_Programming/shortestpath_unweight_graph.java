
/// *** SHROTEST PATH IN UNDIRECTED GRAPH **** ////



package Graph_Programming;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class shortestpath_unweight_graph {
    static void addEdge(ArrayList<ArrayList<Integer>> list,int u,int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }
    static void BFS(ArrayList<ArrayList<Integer>> list,int v,int s,int [] dist){
        boolean [] visited=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        visited[s]=true;
        q.add(s);
        while(!q.isEmpty()){
            int val=q.poll();
            for(int x:list.get(val)){
                if(visited[x]==false){
                    dist[x]=dist[val]+1;
                    visited[x]=true;
                    q.add(x);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<v;i++){
            list.add(new ArrayList<Integer>());
        }
        addEdge(list,0,1);
        addEdge(list,0,2);
        addEdge(list,1,2);
        addEdge(list,1,3);
        addEdge(list,2,3);
        int [] dist=new int[v];
        for(int i=0;i<v;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[0]=0;
        BFS(list,v,0,dist);

        for(int i=0;i<v;i++){
            System.out.print(dist[i]+"   ");
        }
    }
}


