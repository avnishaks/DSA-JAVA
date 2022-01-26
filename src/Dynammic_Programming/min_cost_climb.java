// 746. Min Cost Climbing Stairs
package Dynammic_Programming;

public class min_cost_climb {
    public static int minCostClimbingStairs(int[] cost) {
        int s1=0,s2=0,curr_step;
        for(int i=cost.length-1;i>=0;i--){
            curr_step=cost[i]+Math.min(s1,s2);
            s1=s2;
            s2=curr_step;
        };
        return Math.min(s1,s2);
    }
    public static void main(String[] args){
        int cost[]={10,15,20};
        System.out.println(minCostClimbingStairs(cost));
    }
}
