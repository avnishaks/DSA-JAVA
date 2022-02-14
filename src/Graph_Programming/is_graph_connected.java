package Graph_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class is_graph_connected {
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

        // write your code here
        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();

        boolean [] visited=new boolean[vtces];
        for(int i=0;i<vtces;i++){
            if(visited[i]==false){
                ArrayList<Integer> link=new ArrayList<>();
                isConnect(graph,i,link,visited);
                comps.add(link);
            }
        }
        System.out.println(comps.size()==1);
    }
    public static void isConnect(ArrayList<Edge>[] graph,int src,ArrayList<Integer> link,boolean [] visted){
        visted[src]=true;
        link.add(src);
        for(Edge e:graph[src]){
            if(visted[e.nbr]==false){
                isConnect(graph,e.nbr,link,visted);
            }
        }
    }
}
