package Array_String;

import java.util.Scanner;

public class arms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int r,sum=0;
        while(temp>0){
           r=temp%10;
           temp=temp/10;
           sum=sum+r*r*r;
        }
        if(sum==n){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
