package Array_String;

import java.util.Scanner;

public class word {
    public static int count(String s){
        if(s==null||s.length()==0){
            return 0;
        }
        String [] arr=s.split("\\s+");
        return arr.length;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        System.out.println(count(s));
    }
}
