package Gfg_Problem_Per_Day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MAtrix_Operation_3March {
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];

            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                    matrix[i][j] = Integer.parseInt(str[k]);
                    k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            System.out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
    }
}


class Solution{

    static boolean InBox(int m,int n,int row,int col){
        if(row<0||col<0||row>=m||col>=n){
            return false;
        }
        return true;
    }
    static int [] endPoints(int [][]arr, int m, int n){
        //code here
        int row=0;
        int col=0;
        int start_row=0;
        int start_col=0;

        char start_position='r';

        Map<Character, Character> move=new HashMap<>();
        move.put('u','r');
        move.put('r','d');
        move.put('d','l');
        move.put('l','u');
        while(InBox(m,n,row,col)){
            start_row=row;
            start_col=col;

            if(arr[row][col]==1){
                char move_dr=move.get(start_position);
                arr[row][col]=0;
                if(move_dr=='d'){
                    row++;
                }
                else if(move_dr=='r'){
                    col++;
                }
                else if(move_dr=='u'){
                    row--;
                }
                else if(move_dr=='l'){
                    col--;
                }

                start_position=move_dr;
            }
            else{
                if(start_position=='r'){
                    col++;
                }
                else if(start_position=='l'){
                    col--;
                }
                else if(start_position=='u'){
                    row--;
                }
                else if(start_position=='d'){
                    row++;
                }
            }

        }
        return new int[]{start_row,start_col};

    }
}