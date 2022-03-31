package HashMap;

import java.util.HashMap;

public class findDuplicate {
    public static  int find(int [] nums){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int x:mp.keySet()){
            System.out.println("Value :-"+ " "+ x+" Count:- "+" "+mp.get(x));
        }
        for(int x: mp.keySet()){
            if(mp.get(x)>1){
                return x;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,2,2};
        System.out.println(find(arr));
    }
}
