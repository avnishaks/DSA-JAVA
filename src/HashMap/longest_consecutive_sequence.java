package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class longest_consecutive_sequence {
    public static int solution(int [] arr){
        HashMap<Integer, Boolean> mp=new HashMap<>();
        for(int val:arr){
            mp.put(val,true);
        }
        for(int val:arr){
            if(mp.containsKey(val-1)){
                mp.put(val,false);
            }
        }

        int len=0;
        for(int val:arr){
            if(mp.containsKey(val)==true){
                int temp_len=0;
                while(mp.containsKey(temp_len+val)){
                    temp_len++;
                }
                if(temp_len>len){
                    len=temp_len;
                }
            }
        }
        return len;
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        solution(arr);
    }
}
