package Array_String;

import java.util.Arrays;
import java.util.Collections;

public class minXor {
    public static int solve(int [] arr){
        Arrays.sort(arr);
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int temp=arr[i]^arr[i+1];
            if(mini>temp){
                mini=temp;
            }
        }
        return mini;
    }
    public static void main(String[] args) {
        int arr[]={0,2,5,7};
        int ans=solve(arr);
        System.out.println("The answer of the variable of the Xor pair is "+ans);
    }
}
