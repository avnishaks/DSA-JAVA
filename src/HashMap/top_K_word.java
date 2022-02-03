package HashMap;

import java.util.*;

public class top_K_word {
    public static void solution(int k, String[] words){
        HashMap<String,Integer> mp=new HashMap<>();
        //Counting the Frequency of All the  String Item
        for(String val:words){
            mp.put(val,1+mp.getOrDefault(val,0));
        }
        PriorityQueue<String> pq=new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int f1=mp.get(o1);
                int f2=mp.get(o2);
                if(f1==f2) return o2.compareTo(o1);
                return f1-f2;
            }
        });
        for(Map.Entry<String,Integer> en:mp.entrySet()){
            pq.add(en.getKey());
            if(pq.size()>k) pq.poll();
        }

        List<String> result=new ArrayList<>();
        while(!pq.isEmpty()){
            result.add(pq.poll());
        }
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+"   ");
        }

        System.out.println();

        Collections.reverse(result);

        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+"   ");
        }
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int k=scn.nextInt();
        String [] words=new String[]{"i","love","leetcode","i","love","coding"};
        solution(k,words);
    }
}
