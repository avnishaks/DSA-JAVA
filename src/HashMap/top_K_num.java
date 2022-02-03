package HashMap;

import java.util.*;

public class top_K_num {
    public static void solution(int [] nums,int k){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int val:nums){
            mp.put(val,mp.getOrDefault(val,0)+1);
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int f1=mp.get(o1);
                int f2=mp.get(o2);
                if(f1==f2) return o2.compareTo(o1);
                return f1-f2;
            }
        });

        for(Map.Entry<Integer,Integer> en: mp.entrySet()){
            pq.add(en.getKey());
            if(pq.size()>k) pq.poll();
        }
        Integer [] ans=new Integer[k];
        int j=0;
        while(!pq.isEmpty()){
            ans[j++]=pq.poll();
        }
        for(int i=0;i< ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        Collections.reverse(Arrays.asList(ans));
        for(int m=0;m< ans.length;m++){
            System.out.print(ans[m]+" ");
        }
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int k=scn.nextInt();
        int [] nums=new int[]{1,1,1,2,2,3};
        solution(nums,k);
    }
}
