package Graph_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bellman_Ford {
    public static int isNegativeWeightCycle(int n, int[][] edges)
    {
        //code here
        int [] dist=new int[n];
        for(int i=0;i<n;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[0]=0;
        for(int i=1;i<n;i++){
            for(var e:edges){
                int u=e[0];
                int v=e[1];
                int w=e[2];
                if(dist[u]!=Integer.MAX_VALUE && dist[v]>dist[u]+w){
                    dist[v]=dist[u]+w;
                }
            }
        }
        for(var e:edges){
            int u=e[0];
            int v=e[1];
            int w=e[2];
            if(dist[u]!=Integer.MAX_VALUE && dist[v]>dist[u]+w){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] edges = new int[m][3];
            for(int i = 0; i < m; i++){
                String S2[] = br.readLine().trim().split(" ");
                for(int j = 0; j < 3; j++)
                    edges[i][j] = Integer.parseInt(S2[j]);
            }
            int ans = isNegativeWeightCycle(n, edges);
            System.out.println(ans);
        }
    }
}
