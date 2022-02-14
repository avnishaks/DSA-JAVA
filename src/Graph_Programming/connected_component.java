package Graph_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class connected_component {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();

        // write your code here
        boolean [] visited=new boolean[vtces];
        for(int i=0;i<vtces;i++){
            if(visited[i]==false){
                ArrayList<Integer> everynode=new ArrayList<>();
                GetComponent(graph,i,everynode,visited);
                comps.add(everynode);
            }
        }

        System.out.println(comps);
    }
    public static void GetComponent(ArrayList<Edge>[] graph,int src, ArrayList<Integer> comp,boolean[] visited){
        visited[src]=true;
        comp.add(src);
        for(Edge e:graph[src]){
            if(visited[e.nbr]==false){
                GetComponent(graph,e.nbr,comp,visited);
            }
        }
    }
}
