package Bit_Masking_Programming;

import java.util.Arrays;
import java.util.Scanner;

/*
Questions:----

In the given array , all the number appearing even number of times , only one number appear odd
number of times, then return the given number.
 */
public class one_odd_occuring {

    /*
    Just perform iteration like , pick an element and iterate to count its number in the list , after that
    we just get the count of the number , and after that , we take the module of the count we get after counting
    total number of times a particular number exist in the array, after that we get the result not a multiple of
    2 , then its occurance is in the odd number of times then return that element, other that element is the even
    number , we just move on.
     */
    public static int TwoForLoop(int [] arr){
        for(int i=0;i< arr.length;i++){
            int count=0;
            for(int j=0;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count%2!=0){
                return arr[i];
            }
        }
        return -1;
    }
    /*
    Here for the Naive Solution we have to look up the neighbouring element , after sorting is perfomed to find
    the odd number present in the List.
     */
    public static int Naive_findOddAppear(int [] arr){
        Arrays.sort(arr);
        int count=1;
        for(int i=0;i< arr.length-1;i++){
            while(i<arr.length-1 && arr[i]==arr[i+1]){
                count++;
                i++;
            }
            if(count%2!=0){
                return arr[i];
            }
            count=1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Dekh le Bhai Answer --> Brute Force Wala, in desi langauage with 2 for Loop ");
        System.out.println(TwoForLoop(arr));
        System.out.println("Dekh Le Bhai Answer --> Brute Force Wala , After Sorting !!! ");
        System.out.println(Naive_findOddAppear(arr));
    }
}
