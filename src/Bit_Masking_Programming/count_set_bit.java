package Bit_Masking_Programming;

import java.awt.image.LookupTable;
import java.util.Scanner;

public class count_set_bit {

    /*
    For the Naive Apporach we take the example as n=5!
    Approach:-
    We are applying the approach to check the last bit of the number:-
    1. If it found to 1 , then increase the counter value.
    2. Then remove the last bit.
    Repeat this steps  till the value of n>0
    After that we return the counter the value.

    n(5) =  0000....0101 (remove the last bit , as n>0)
            0000....0010 (remove the last bit , as n>0) increase the count!(0->1)
            0000....0001 (remove the last bit , as n>0) increase the count!(1->2)
            0000....0000 (now we encounter the value of n as it equal to 0 ) so return the count as 2.
     */
    public static int NaivecountSetBit(int n){
        int count=0;
        while(n>0){
            /*
            n&1
            n(5) : 0000....0101
            1    : 0000....0001
            o/p  : 0000....0001 ( its equal to 1 , if last bit set then value comes to 1 only.)
             */
           count=count+(n&1);
           n=n>>1; // Remove the last bit
        }
        return count;
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


     */
    public static int BKA(int n){
         int counter =0;
         while(n>0){
             n=(n&(n-1));
             counter++;
         }
         return counter;
    }
    /*
    LookUp Tabel Method:-
    ** When the value of n is range from 0 to 255.
    Algorithm:-
    1. Divide the bits segment in 8 size segments for 32 bits.
    2. As it divided into 4 segment, each segment contains 8 bits , then range of min =0 to max =2^7 -1.
    3. Now we declared the tabel of 256 size in which each of the block contains the number of set bits
    map to each index number.
    4. After that we just perform operation over the 8 chunk of bit segment and find the set bit corrosponds to it
    from the table , then we shift for another 8 segment using Right shift operator .
    5. Following the steps for rest of segment of 8 bits , then return the answer.


     */
    static int [] tabel=new int[256];
    public static void precompute(){
        tabel[0]=0;
        for(int i=1;i<256;i++){
            tabel[i]=(i&1)+tabel[i/2];
        }
    }
    public static int LookupTableMethod(int n){
        int res=tabel[n & 0xff];
        n=n>>8;
        res=res+tabel[n & 0xff];
        n=n>>8;
        res=res+tabel[n & 0xff];
        n=n>>8;
        res=res+tabel[n & 0xff];
        return res;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(NaivecountSetBit(n));

        System.out.println("Brian Kernighan's Algorithm");

        System.out.println(BKA(n));


        System.out.println("Constant Time O(1)");
        precompute();
        System.out.println(LookupTableMethod(n));
    }
}
