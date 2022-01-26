package Dynammic_Programming;

/*
 Leetcode
  Here we have an array of size 10^4
  so count contain all element from O to 10000
  then we mention the freq of all the nums element in count array
  then we take the choice of exclude or include , if we choose x , then we cant choose x-1 or x+1 , we
  on one case choose a particluar value of x , then we calculate the value , as include and exclude , then
  at last we return max of include or exclude , i.e will be our answer.
 */
public class delete_and_earn {
    public static int deleteAndEarn(int[] nums) {
        int include=0,exclude=0;
        int [] count=new int[10001];
        for(int i:nums){
            count[i]++;
        }
        for(int i=0;i<10001;i++){
            int new_include=exclude+count[i]*i;
            int new_exclude=Math.max(include,exclude);
            include=new_include;
            exclude=new_exclude;
        }
        return Math.max(include,exclude);
    }
    public static void main(String[] args){
        int [] nums={2,2,3,3,3,4};
        System.out.println(deleteAndEarn(nums));
    }

}
