package Array_String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class powerPokemon {
    public static int countPair(int [] arr,int n){
        Map<Integer, Integer> m
                = new HashMap<>();
        for (int i = 0; i < n; i++)
            m.put(arr[i], m.getOrDefault(
                    arr[i], 0)
                    + 1);
        int ans = 0;
        for (int i = 0; i < 31; i++) {
            int key = (int)Math.pow(2, i);
            for (int j = 0; j < arr.length;
                 j++) {
                int k = key - arr[j];
                ans += m.getOrDefault(k, 0);
                if (k == arr[j])
                    ans++;
            }
        }
        return ans / 2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(countPair(arr,n));
    }
}
