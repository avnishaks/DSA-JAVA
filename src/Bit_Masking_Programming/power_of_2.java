package Bit_Masking_Programming;

import java.util.Scanner;

/*
Different Method:-
1. Naive Approach :-
-> Just start dividing the value by 2 , if we encounter any odd number in that , before reaching to value of 1.
   Then just return the false , else if we reach the value equals to 1 , then we return true.
2. Efficient solution:-
-> For the number to be a power of 2 , their is only one set bit , so if we count the set bit of the number , if
   it comes to 1 , then its the power of 2.
3. More Efficent Solution:-
-> When we dry run the code for even number , n and take the and with n-1 , then answer always be equal to zero.
   Which is done in the constant time so we can optimized the solution much more.
*/
public class power_of_2 {
    /*
    Naive Approach:-
    Algorithm :-
    1. True(1) means power of 2 , False(0) means not the power of 2.
    2. Divide the number by 2 , when we ends with the value of number as 1 at the end without encounter the
    odd value , we just return 1 (true) otherwise return 0(false).

     */
    public static int NaiveApproach(int n){
        if(n==0) return 1;
        while(n!=1){
            if(n%2!=0) return 0;
            n=n/2;
        }
        return 1;
    }
    /*
     Brian Kernighan's Algorithm:-
    Algorithm :-
    1. We run a loop till n>0 , as and increase the counter every time.
    2. We take and  of curr n value to n-1 , and repeat it, till we get n equals to 0.

    To understand this we take the example , same as previous as for the value of n=5

    n(5) :- 00....0101 (this is representation of value 5 in binary)
    1. Here we have n>0 !
       n=n&(n-1)
       5: 00....0101
       4: 00....0100
     o/p: 00....0100 (here we have get the value of n=4 , again take and with n-1 , that is 3 ) ,
                      here n>0 , counter is change from 0 to 1.
    2. Here we have n>0
       n=n&(n-1)
       4: 00....0100
       3: 00....0011
     o/p: 00....0000 ( Here we have the value equal to 0 , for the next iteration n==0 , so we increase
                      the count and come out of loop).

    3. Here we have n==0
       so we return the counter.


     Notes:- *^If we have the counter value equal to 1 , then it's the power of 2 , else it's not the power of 2.
     */
    public static int BKA(int n){
        int counter=0;
        while(n>0){
            n=(n&(n-1));
            counter++;
        }
        return counter==1?1:0;
    }
    /*
    Efficient Method:-
    Example:- We take an example of n=4 and n=8 to understand the pattern.
    1. If n=4:
             4: 00....0100
             3: 00....0011
           o/p: 00....0000 ( 4&3)-> (n &(n-1))
   2. If n=8:
            8: 00....1000
            7: 00....0111
          o/p: 00....0000 (8 & 7) -> (n & (n-1))
   From above two example we understand that , if any given number n , is power of 2 , then (AND) operation
   with n-1 , result to be zero (0).

   So , If we encounter the value of the number equals to be zero (0) then its the power of 2 , otherwise not!

     */



    public static int EBKA(int n){
        if(n==0) return 1;
        return (n&(n-1))==0?1:0;
    }





    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Naive Approach Method :- > ");
        System.out.println(NaiveApproach(n));
        System.out.println("Brian Kernighan's Algorithm Method : - > ");
        System.out.println(BKA(n));
        System.out.println("Expansion of  Brian Kernighan's Algorithm Method in more efficient method : - > ");
        System.out.println(EBKA(n));
    }




}
