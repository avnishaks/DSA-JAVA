package Array_String;

import java.util.Scanner;

public class difference_bw_char {
    public static String findDiff(String s){
        String str="";
        for(int i=0;i<s.length()-1;i++){
            int curr=s.charAt(i);
            int next=s.charAt(i+1);
            int diff=next-curr;
            str+=s.charAt(i);
            str+=diff;
        }
        return str+s.charAt(s.length()-1);
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        System.out.println(findDiff(s));
    }
}
