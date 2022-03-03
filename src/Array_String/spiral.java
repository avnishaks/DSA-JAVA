package Array_String;

import java.util.ArrayList;
import java.util.List;

public class spiral {
    public static boolean canVisit(int rows,int cols,int r,int c, boolean visited[][])
    {
        return r>=0 && c>=0 && r<rows && c<cols && !visited[r][c];
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        boolean visited[][]=new boolean[rows][cols];

        int r=0 ;
        int c=0;
        List<Integer> sol=new ArrayList<>();
        dfs(sol,visited,matrix,0,0,0);
        return sol;
    }
    public static void dfs( List<Integer> sol, boolean visited[][],int[][] matrix, int r, int c,int dir){
        if(!canVisit(matrix.length,matrix[0].length,r,c,visited))
            return;
        visited[r][c]=true;
        sol.add(matrix[r][c]);
        if(dir==0){
            dfs(sol,visited,matrix,r,c+1,0);
            dir=1;
        }
        if(dir==1){
            dfs(sol,visited,matrix,r+1,c,1);
            dir=2;
        }
        if(dir==2){
            dfs(sol,visited,matrix,r,c-1,2);
            dir=3;
        }
        if(dir==3){
            dfs(sol,visited,matrix,r-1,c,3);
            dfs(sol,visited,matrix,r,c+1,0);
        }
    }
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println(spiralOrder(a));
    }
}
