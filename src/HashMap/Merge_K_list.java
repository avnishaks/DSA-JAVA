package HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Merge_K_list {
    public static class Pair implements Comparable<Pair>{
        int list_idx;
        int element_idx;
        int value;

        Pair(int list_idx,int element_idx,int value){
            this.list_idx=list_idx;
            this.element_idx=element_idx;
            this.value=value;
        }

        @Override
        public int compareTo(Pair o) {
            return this.value-o.value;
        }
    }
    public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists){
        ArrayList<Integer> rv = new ArrayList<>();

        // write your code here
        PriorityQueue<Pair> pq=new PriorityQueue<>();

        for(int i=0;i<lists.size();i++){
            Pair p=new Pair(i,0,lists.get(i).get(0));
            pq.add(p);
        }

        while(pq.size()>0){
            Pair p=pq.remove();
            rv.add(p.value);
            p.element_idx++;
            if(p.element_idx<lists.get(p.list_idx).size()){
                p.value=lists.get(p.list_idx).get(p.element_idx);
                pq.add(p);
            }
        }
        return rv;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for(int i = 0; i < k; i++){
            ArrayList<Integer> list = new ArrayList<>();

            int n = Integer.parseInt(br.readLine());
            String[] elements = br.readLine().split(" ");
            for(int j = 0; j < n; j++){
                list.add(Integer.parseInt(elements[j]));
            }

            lists.add(list);
        }

        ArrayList<Integer> mlist = mergeKSortedLists(lists);
        for(int val: mlist){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
