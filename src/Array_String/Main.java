package Array_String;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static String findMin(char num[],int k){
        int len= num.length;
        if(len==0||k==0){
            return new String(num);
        }
        if(len==1){
            return "0";
        }
        if(num[0]!='1'){
            num[0]='1';
            k--;
        }
        int i=1;
        while(k>0 && i<len){
            if(num[i]!='0'){
                num[i]='0';
                k--;
            }
            i++;
        }
        return new String(num);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();

        while(tc>0){
            int N=sc.nextInt();
            int k=sc.nextInt();
            int val=sc.nextInt();
            String num=Integer.toString(val);
            String ans=findMin(num.toCharArray(),k);
            System.out.println(Integer.parseInt(ans));
            tc--;
        }
    }
}