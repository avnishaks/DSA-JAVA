package January_2022;


public class House_Robber_II {
    public static int find(int [] nums,int start,int end){
        int include=0,exclude=0,max=0;
        for(int i=start;i<end;i++){
            max=Math.max(include+nums[i],exclude);
            include=exclude;
            exclude=max;
        }
        return max;
    }
    public static int rob(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        return Math.max(find(nums,0,nums.length-1),find(nums,1,nums.length));
    }
    public static void main(String[] args){
        int [] nums={1,2,3,1};
        System.out.println(rob(nums));
    }
}
