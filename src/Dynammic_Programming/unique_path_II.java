package Dynammic_Programming;

import java.util.Scanner;

public class unique_path_II {
    public static int findPath(int [][] obstacleGrid){
        int row=obstacleGrid.length;
        int col=obstacleGrid[0].length;

        // if the start has obstacle then there is no path to reach start to end.
        if(obstacleGrid[0][0]==1){
            return 0;
        }
        // Filling the 0-th row and 0-th col ways is only 1
        obstacleGrid[0][0]=1;

        // Filling the 0 th Col
        for(int i=1;i<row;i++){
            obstacleGrid[i][0]=(obstacleGrid[i][0]==0&&obstacleGrid[i-1][0]==1)?1:0;
        }

        // Filling the 0 th Row
        for(int i=1;i<col;i++){
            obstacleGrid[0][i]=(obstacleGrid[0][i]==0 && obstacleGrid[0][i-1]==1)?1:0;
        }


        // Filling the Tabel

        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(obstacleGrid[i][j]==0){
                    obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
                }
                else{
                    obstacleGrid[i][j]=0;
                }
            }
        }

        return obstacleGrid[row-1][col-1];

    }
    public static void main(String[] args){

        // User Input Driver Code
//        Scanner sc=new Scanner(System.in);
//        int row=sc.nextInt();
//        int col=sc.nextInt();
//        int [][] obstacleGrid=new int[row][col];
//
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                obstacleGrid[i][j]= sc.nextInt();
//            }
//        }
        int [][] obstacleGrid={{0,0,0},{0,1,0},{0,0,0}};
        int total_path=findPath(obstacleGrid);
        System.out.println(total_path);
    }
}
