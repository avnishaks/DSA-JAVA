package January_2022;

import java.util.Scanner;

public class climb_stair {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<n+1;i++){
            if(i==1){
                dp[i]=dp[i-1];
            }
            else if(i==2){
                dp[i]=dp[i-1]+dp[i-2];
            }
            else{
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }
        }
        System.out.println(dp[n]);
    }
}
