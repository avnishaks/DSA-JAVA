package Array_String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class differ_2 {
        public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            List<List<Integer>> list= new ArrayList<>();
            List<Integer> l1= new ArrayList<Integer>(nums1.length);
            for(int i:nums1){
                l1.add(i);
            }
            List<Integer> l2=new ArrayList<Integer>(nums2.length);
            for(int i:nums2){
                l2.add(i);
            }
            Set<Integer> s1=new HashSet<Integer>(l1);
            s1.removeAll(l2);
            List<Integer> li1=new ArrayList<>(s1);
            list.add(li1);
            Set<Integer> s2=new HashSet<Integer>(l2);
            s2.removeAll(l1);
            List<Integer> li2=new ArrayList<>(s2);
            list.add(li2);
            return list;
        }
       public static void main(String[] args) {
            int nums1[]={1,2,3};
            int nums2[]={2,4,6};
            List<List<Integer>> ans=findDifference(nums1,nums2);
           for (int i = 0; i < ans.size(); i++) {
               for (int j = 0; j < ans.get(i).size(); j++) {
                   System.out.print(ans.get(i).get(j) + " ");
               }
               System.out.println();
           }

        }
}
