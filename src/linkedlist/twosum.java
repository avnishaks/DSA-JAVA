package linkedlist;

import java.util.Arrays;

public class twosum {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int x:nums1){
            System.out.print(x);
        }
        System.out.println();
        for(int x:nums2){
            System.out.print(x);
        }
        System.out.println();
        System.arraycopy(nums2,0,nums1,m,n);
        for(int x:nums1){
            System.out.print(x);
        }
        System.out.println();
        Arrays.sort(nums1);
    }
    public static void main(String[] args){
        int [] nums1={1,2,3,0,0,0};
        int [] nums2={2,5,6};
        int m=3 ,n=3;
        merge(nums1,m,nums2,n);
    }
}