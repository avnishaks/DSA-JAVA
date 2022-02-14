package Graph_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class perfectFriend {
    public static class Edge{
        int v;
        int e;
        Edge(int v,int e){
            this.v=v;
            this.e=e;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        // write your code here
        ArrayList<Edge>[] graph=new ArrayList[n];
        for(int v=0;v<n;v++){
            graph[v]=new ArrayList<>();
        }
        for(int e=0;e<k;e++){
            String [] parts=(br.readLine()).split(" ");
            int v1=Integer.parseInt(parts[0]);
            int v2=Integer.parseInt(parts[1]);
            graph[v1].add(new Edge(v1,v2));
            graph[v2].add(new Edge(v2,v1));
        }

        boolean[] visited=new boolean[n];
        ArrayList<ArrayList<Integer>> comps=new ArrayList<>();
        for(int v=0;v<n;v++){
            if(visited[v]==false){
                ArrayList<Integer> cmp=new ArrayList<>();
                getComponent(graph,v,cmp,visited);
                comps.add(cmp);
            }
        }
        int total=0;
        for(int i=0;i<comps.size();i++){
            for(int j=i+1;j<comps.size();j++){
                int count=comps.get(i).size()*comps.get(j).size();
                total+=count;
            }
        }
        System.out.println(total);
    }
    public static void getComponent(ArrayList<Edge> [] graph,int src,ArrayList<Integer> cmp,boolean [] visited){
        visited[src]=true;
        cmp.add(src);
        for(Edge e:graph[src]){
            if(visited[e.e]==false){
                getComponent(graph, e.e, cmp,visited);
            }
        }
    }

}