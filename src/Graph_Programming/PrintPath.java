package Graph_Programming;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintPath {
    static class Edge{
        int src;
        int nbr;
        int wt;
        Edge(int src,int nbr,int wt){
            this.src=src;
            this.nbr=nbr;
            this.wt=wt;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int vert=sc.nextInt();
        int edge=sc.nextInt();
        ArrayList<Edge>[] graph=new ArrayList[vert];
        for(int i=0;i<vert;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edge;i++){
            int v1= sc.nextInt();
            int v2=sc.nextInt();
            int weight=sc.nextInt();
            graph[v1].add(new Edge(v1,v2,weight));
            graph[v2].add(new Edge(v2,v1,weight));
        }
        int src=sc.nextInt();
        int dest=sc.nextInt();
        boolean [] visited=new boolean[vert];
        PrintAllPath(graph,src,dest,visited,src+"");
    }
    public static void  PrintAllPath(ArrayList<Edge>[] graph, int src, int dest, boolean [] visited,String psf){
        if(src==dest){
            System.out.println(psf);
            return;
        }
        visited[src]=true;
        for(Edge edge:graph[src]){
            if(visited[edge.nbr]==false){
                PrintAllPath(graph,edge.nbr,dest,visited,psf+edge.nbr);
            }
        }
        visited[src]=false;
    }
}
