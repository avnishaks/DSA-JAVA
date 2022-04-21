package Array_String;

import java.util.Scanner;

public class AddNumberXOR {
    public static int sum(int a,int b){
        if(b==0) return a;
        else{
            return sum(a^b,(a&b)<<1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(sum(5,3));
    }
}
