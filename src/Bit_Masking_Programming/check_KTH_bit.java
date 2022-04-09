package Bit_Masking_Programming;

import java.util.Scanner;

public class check_KTH_bit {
    /*
    Note:- In the Left Shift method , we take example n=5 and k=3
    n= 00000.....0101 (5)
    1= 00000.....0100 (using left shift we shift the value 1)
  o/p= 00000.....0100 ( output is any +ve integer that means the at k-th position its set , 1 & 1= 1).
     */
    public static int UsingLeftShift(int n,int k){
        if((n&(1<<(k-1)))!=0){
            return 1;
        }
        else{
            return 0;
        }
    }
    /*
    Note:- In the Right shift method , we take the same example n=5 and k=3
    n=  0000....0101 (5)
    n>>(3-1) (right shift of n>>2)
    After the right shift operator we have
    n= 0000....0001
    1= 0000....0001
  n&1= 0000....0001 ( we have to get the value equivalent to 1 for the kth bit is set or not judgement.)
     */
    public static int UsingRightShift(int n,int k){
        if((n>>(k-1)&1)==1){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(UsingLeftShift(n,k));
        System.out.println(UsingRightShift(n,k));
    }
}
