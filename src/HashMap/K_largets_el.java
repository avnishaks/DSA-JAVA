package HashMap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class K_largets_el {

    public static void solve(int n,int[] arr,int k){
        //Write your code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            if(i<k){
                pq.add(arr[i]);
            }
            else{
                if(arr[i]>pq.peek()){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
//        while(pq.size()>0){
//            System.out.print(pq.remove()+" ");
//        }
        int [] ans=new int[k];
        int c=0;
        while(pq.size()>0){
            ans[c]=pq.remove();
            c++;
        }
        for(int i=ans.length-1;i>=0;i--){
            System.out.print(ans[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        solve(n,num,k);
    }
}

//8
//        44 -5 -2 41 12 19 21 -6
//        2
