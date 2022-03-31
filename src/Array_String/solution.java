package Array_String;

import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] A=new int[n];
        int [] B=new int[n];
        for(int i=0;i<n;i++){
            A[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            B[i]=sc.nextInt();
        }
        Map<Integer, ArrayList<Integer>> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(A[i])){
                 ArrayList<Integer> list=mp.get(A[i]);
                 list.add(B[i]);
                 mp.put(A[i],list);
            }
            else{
                ArrayList<Integer> list=new ArrayList<>();
                list.add(B[i]);
                mp.put(A[i],list);
            }
        }
        Map<Integer,Integer> avgmp=new HashMap<>();
        Set<Integer> set=mp.keySet();
        for(Integer key:set){
            int len=mp.get(key).size();
            int sum=0;
            for(Integer v:mp.get(key)){
                sum+=v;
            }
            int avg=sum/len;
            avgmp.put(key,avg);
        }

        ArrayList<Integer> newlist=new ArrayList<>();
        for(int i=0;i<n;i++){

            int final_val=B[i]-avgmp.get(A[i]);
            newlist.add(final_val);
        }

        for(int i=0;i<newlist.size();i++){
            System.out.print(newlist.get(i)+" ");
        }
    }
}
