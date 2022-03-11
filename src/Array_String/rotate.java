package Array_String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class rotate {
    public static void rightByOne(int arr[]){
        int l=arr[arr.length-1];
        for(int i= arr.length-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=l;
    }
    public static int ArrayRotation(int arr[],int k){
        for(int i=0;i<k;i++){
            rightByOne(arr);
        }
        String s="";
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
        }
        return Integer.parseInt(s);
    }
    public static String revrse(String s){
        if(s.length()<=1){
            return s;
        }
        String f=s.substring(0,1);
        String l=s.substring(1);
        return revrse(l)+f;
    }
    public static void fun(int a, List<Integer> b){
        a+=1;
        b.add(1);

    }
    public static void main(String[] args) {
        int a=0;
        List<Integer> b=new ArrayList<>();
        fun(a,b);
        System.out.println(a+b.toString());
        String s="Avnish";
        System.out.println(revrse(s));
        int arr[]={4,3,4,3,1,2};
        int k=arr.length-arr[0];
        String [] y={"1","2","15","-7","300"};
        Arrays.sort(y);;
        for(int i=0;i<y.length;i++){
            System.out.println(y[i]);
        }
        int ans=ArrayRotation(arr,k);
        System.out.println(ans);
    }
}
