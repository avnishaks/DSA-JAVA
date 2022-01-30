package Dynammic_Programming;

import java.util.Scanner;

public class unique_path {
    public static int findPath(int row,int col){
        if(row<=0||col<=0){
            return 0;
        }

        int [][] dp=new int[row][col];

        for(int i=0;i<col;i++){
            dp[0][i]=1;
        }

        for(int i=0;i<row;i++){
            dp[i][0]=1;
        }

        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }

        return dp[row-1][col-1];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int total_path=findPath(row,col);
        System.out.println(total_path);
    }
}
