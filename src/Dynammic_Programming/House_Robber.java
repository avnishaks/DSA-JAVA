package Dynammic_Programming;

public class House_Robber {
    public static int rob(int[] nums) {
        int n=nums.length;
        int [] dp=new int[n+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=1;i<n;i++){
            dp[i+1]=Math.max(dp[i],nums[i]+dp[i-1]);
        }
        return dp[n];
    }
    public static void main(String[] args){
        int [] nums={2,7,9,3,1};
        System.out.println(rob(nums));
    }
}
