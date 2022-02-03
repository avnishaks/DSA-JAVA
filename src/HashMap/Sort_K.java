package HashMap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Sort_K {
    public static void solution(int[] arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<=k;i++){
            pq.add(arr[i]);
        }
        for(int i=k+1;i< arr.length;i++){
            System.out.println(pq.remove());
            pq.add(arr[i]);
        }
        while(pq.size()>0){
            System.out.println(pq.remove());
        }
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        solution(arr,k);
    }
}
