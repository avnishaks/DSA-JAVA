package Dynammic_Programming;


public class House_Robber_II {
    public static int rob(int[] nums){
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);

        // When first house is included , last excluded
        int [] dp=new int[n+1];
        dp[1]=nums[0];
        for(int i=2;i<=n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }
        int include=dp[n-1];

        // When last house included , first included
        dp=new int[n+1];
        dp[2]=nums[1];
        for(int i=3;i<=n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }

        return Math.max(dp[n],include);
    }
    public static void main(String[] args){
        int [] nums={1,2,3};
        System.out.println(rob(nums));
    }
}
