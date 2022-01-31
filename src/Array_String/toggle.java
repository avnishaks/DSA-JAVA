package Array_String;

import java.util.Scanner;

public class toggle {
    public static String togglefn(String s){
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' &&ch<='z'){
                char uc=(char)('A'+ch-'a');
                str+=uc;
            }
            else if(ch>='A'&&ch<='Z'){
                char lc=(char)('a'+ch-'A');
                str+=lc;
            }
            else {
                str+=ch;
            }
        }
        return str;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String s= scn.nextLine();
        System.out.println(togglefn(s));
    }
}
