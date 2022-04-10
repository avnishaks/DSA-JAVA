package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class maxi_mini_sequence {
    public static int find_No_Of_Operation_To_Make_Sequence(int [] arr){
        int operation=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int i=0;
        while(i<arr.length){
            if(!pq.isEmpty()&&pq.peek()<arr[i]){
                operation+=Math.abs(pq.peek()-arr[i]);
                pq.add(arr[i]);
                pq.poll();
            }
            pq.add(arr[i]);
            i++;
        }
        return operation;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int ans=find_No_Of_Operation_To_Make_Sequence(arr);
        System.out.println(ans);
    }
}
