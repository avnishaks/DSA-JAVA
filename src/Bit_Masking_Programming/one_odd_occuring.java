package Bit_Masking_Programming;

import java.util.Arrays;
import java.util.Scanner;

/*
Questions:----

In the given array , all the number appearing even number of times , only one number appear odd
number of times, then return the given number.
1. Two For Loop o(N^2)
2. Naive Sorting O(N*log(N)).
3. Bits Manipulation O(N)
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
    /*
     In the method of Bits Manipulation ,which generally take Time Complexity of O(N) and Space Complexity O(1).

     1. We take the xor with all the number , which ultimate give the odd number of times occurring of the number.
     2. x^x=0 , x^0 =x , x^y=y^x , x^(y^z)=(x^y)^z.
     3. As we see even number of occuring of number gives the result as , 0 ,and xor with any number with zero is
        number itself.
     */

    public static int BitsWalaApproach(int [] arr){
        int count=0;
        for(int i=0;i< arr.length;i++){
            count=count^arr[i];
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Dekh le Bhai Answer --> Brute Force Wala, in desi langauage with 2 for Loop O(N^2) ");
        System.out.println(TwoForLoop(arr));
        System.out.println("Dekh Le Bhai Answer --> Brute Force Wala , After Sorting O(N*log(N)) !!! ");
        System.out.println(Naive_findOddAppear(arr));

        System.out.println("Dekh Le Bhai Answer --> Bits Manipulation se--> O(n) Time lega aur O(1) space lega !");
        System.out.println(BitsWalaApproach(arr));
    }
}
