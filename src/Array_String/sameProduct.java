package Array_String;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class sameProduct {
    public static int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int countOfSameProducts = 0;
        for(int i=0; i<=nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                int product = nums[i]*nums[j];
                hash.put(product, hash.getOrDefault(product, 0)+1);
            }
        }
        Collection<Integer> values = hash.values();
        for(int value : values)
            countOfSameProducts += 8*value*(value-1)/2;
        return countOfSameProducts;
    }
    public static void main(String[] args) {
        /*
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         */
        int [] arr={2,3,4,6};
        System.out.println(tupleSameProduct(arr));
    }
}
