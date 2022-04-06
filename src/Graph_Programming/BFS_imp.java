package Graph_Programming;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_imp {
    static void addEdge(ArrayList<ArrayList<Integer>> list, int u, int v){
         list.get(u).add(v);
         list.get(v).add(u);
    }
    static void BFS(ArrayList<ArrayList<Integer>> list,int V,int s){
        boolean [] visited=new boolean[V];
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
    public static void main(String[] args) {
        int V=5;
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
        addEdge(list,0,1);
        addEdge(list,0,2);
        addEdge(list,1,2);
        addEdge(list,2,3);
        addEdge(list,1,3);
        addEdge(list,3,4);
        addEdge(list,2,4);

        System.out.println("Following is Breadth First Traversal: ");
        BFS(list,V,0);
    }
}
