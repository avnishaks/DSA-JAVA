package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_by_Value {
    public  static HashMap<Integer,Integer> sortMap(HashMap<Integer,Integer> mp){
        HashMap<Integer,Integer> temp=new HashMap<>();
        return temp;
    }
    public static void solution(int [] nums){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int val:nums){
            if(mp.containsKey(val)){
                mp.put(val,mp.get(val)+1);
            }
            else{
                mp.put(val,1);
            }
        }
        HashMap<Integer,Integer> temp=sortMap(mp);
        for(Map.Entry<Integer,Integer> en: temp.entrySet()){
            System.out.println(en.getKey()+"    "+en.getValue());
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        solution(nums);
    }
}
