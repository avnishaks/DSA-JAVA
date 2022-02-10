package Graph_Programming;

import java.util.ArrayList;
import java.util.Scanner;

public class CountPath {
    static int path=0;
    static class Edge{
        int src;
        int nbr;
        Edge(int src,int nbr){
            this.src=src;
            this.nbr=nbr;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vert= sc.nextInt();
        int edge=sc.nextInt();
        ArrayList<Edge> [] graph=new ArrayList[vert];
        for(int i=0;i<vert;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edge;i++){
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            graph[v1].add(new Edge(v1,v2));
        }
        int src=sc.nextInt();
        int dest=sc.nextInt();
        System.out.println(CountPath(graph,src,dest));
    }

    public static int CountPath(ArrayList<Edge>[] graph,int src,int dest){
        dfs(graph,src,dest);
        return path;

    }
    public static void dfs(ArrayList<Edge>[] graph,int src,int dest){
        if(src==dest){
            path++;
            return;
        }
        for(Edge edge:graph[src]){
            if(edge.src==src){
                dfs(graph,edge.src,dest);
            }
        }
    }

}
