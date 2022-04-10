package Bit_Masking_Programming;
/*

Given an array of the integer in which their are so many elements of length size of array "N" is present
in such a way their are only two integer are present which appears odd number of times , rest occurred
in even number of times. Our task is to return the those two element which is listed odd number of times.

Approach:-
1. Two For Loop ( O(n^2) )
2. Brute Force using sorting ( O(n*log(n) )
3. Bits Manipulation
 */


import java.util.Arrays;
import java.util.Scanner;

public class two_odd_occuring {
    /*
  Just perform iteration like , pick an element and iterate to count its number in the list , after that
  we just get the count of the number , and after that , we take the module of the count we get after counting
  total number of times a particular number exist in the array, after that we get the result not a multiple of
  2 , then its occurance is in the odd number of times then return that element, other that element is the even
  number , we just move on.
   */
    public static void TwoForLoop(int [] arr){
        for(int i=0;i< arr.length;i++){
            int count=0;
            for(int j=0;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        return;
    }
    /*
   Here for the Naive Solution we have to look up the neighbouring element , after sorting is perfomed to find
   the odd number present in the List.
    */
    public static void Naive_findOddAppear(int [] arr){
        Arrays.sort(arr);
        int count=1;
        for(int i=0;i< arr.length-1;i++){
            while(i<arr.length-1 && arr[i]==arr[i+1]){
                count++;
                i++;
            }
            if(count%2!=0){
                System.out.print(arr[i]+" ");
            }
            count=1;
        }
        return;
    }
    /*
    Time complexity is of O(N) and space complexity of O(1).
    Algorithms:-
    1. Take the Xor (^) of every number.
    2. Finallay we get the result as the xor of two odd number present in the array.
    3. Find the right most bit of the xor result using expression ( xor & ~(xor-1) ).
    4. Now we divide the element on the basis of set bit :-
       a. One Group having the last bit is the set bit .
       b. Other Group having the last bit is not set bit.
    5. After performing xor in group 1 and group 2 , we get our respective value one from group 1 and group 2.

    Take an example to understand it better.
    Given an array , as arr :- >

    arr= [ 3 , 4 , 3 , 4 , 8 , 4 , 4 , 32 , 7 , 7 ]

    1. Here all the number are coming as in even order of times , except 8 and 32 , so it contains the
       value final answer as the res= 8^32

       8: 0000..001000
      32: 0000..100000
     o/p: 0000..101000 (40) ( so in the res it contains the value of 40).

    2. Now we have to find the right most set bit of the res i.e (40).

       For the right most set bit of the number we have the expression :- n&~(n-1)

       For , 40 :->
                 (n)   40: 0000..101000
                 ~(n-1):->
                    39: 0000..100111
                   ~39: 1111..011000
       Now we have to take 40 & ~ 39:
                    40: 0000..101000
                   ~39: 1111..011000
                  o/p : 0000..001000 ( right most set bit of resultant xor value 40 , comes as 8).

     3. Now on the basis of right most set bit of res , we divide the arr , into two parts:-

        a) Firstly , those number , (Xor number right most set bit === Coming number bit).
        b) Secondly , those number ,(Xor number right most set bit !== Coming number bit).

     After performing all the operation :-
     a) Group 1 :- [ 8 ]
     b) Group 2 :- [ 3 , 3 ,4 , 4 , 4 , 4 , 32 , 7 , 7 ]


     4. Now perform xor on both the group 1  and group 2:-

     a) result 1 = 8 ( from group 1 )
     b) result 2 = 32 ( from group 2) -> (x^x=0)

     5. Thus we get the final answer as the 8 and 32 .

     */
    public static void Bits_Approach(int [] arr){
        int res=0, res1=0, res2=0;
        for(int i=0;i< arr.length;i++){
            res=res^arr[i];
        }
        int right_most_bit=(res&~(res-1));
        for(int i=0;i< arr.length;i++){
            if((arr[i]&right_most_bit)!=0){
                res1^=arr[i];
            }
            else{
                res2^=arr[i];
            }
        }
        System.out.println(res1+"   "+res2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Brute force wala Two For Loop Answer :----> O(N^2)");
        TwoForLoop(arr);
        System.out.println();
        System.out.println("Brute force approach using sorting wala ----> O(N*log(N)) ");
        Naive_findOddAppear(arr);
        System.out.println();
        System.out.println("Bits Manipulation Approach we followed for the efficient Solution ----> O(N)");
        Bits_Approach(arr);


    }
}
