package Array_String;

import java.util.Scanner;

public class modulo {
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int a= sc.nextInt();
            int b=sc.nextInt();
            int val=fact(a)%b;
            System.out.println(val);
        }
    }
}
