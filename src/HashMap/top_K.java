package HashMap;

import java.util.*;

public class top_K {
    public static HashMap<Integer,Integer> sortMap(HashMap<Integer,Integer> mp){
        List<Map.Entry<Integer,Integer>> list=new LinkedList<Map.Entry<Integer, Integer>>                                                                                                  (mp.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        HashMap<Integer,Integer> temp=new LinkedHashMap<Integer,Integer>();
        for(Map.Entry<Integer,Integer> en:list){
            temp.put(en.getKey(), en.getValue());
        }
        return temp;
    }
    public static void topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int val:nums){
            hm.put(val,1+hm.getOrDefault(val,0));
            //  if(hm.containsKey(val)){
            //      hm.put(val,hm.get(val)+1);
            //  }
            //  else{
            //      hm.put(val,1);
            //  }
        }
        HashMap<Integer,Integer> hm1=sortMap(hm);
        int val= hm1.size()-k;
        int i=0,c=0;
        int [] ans=new int[k];
        for(Map.Entry<Integer,Integer> en:hm1.entrySet()){
            if(i<val){
                i++;
            }
            else {
                ans[c++]=en.getKey();
            }
        }
        for(int j=0;j< ans.length;j++){
            System.out.print(ans[j]+" ");
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k= sc.nextInt();
        int [] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]= sc.nextInt();
        }
        topKFrequent(num,k);
    }
}
