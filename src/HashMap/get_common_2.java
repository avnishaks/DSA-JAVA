package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class get_common_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int [] a1=new int[n1];
        for(int i=0;i<n1;i++){
            a1[i]=sc.nextInt();
        }

        int n2= sc.nextInt();
        int [] a2=new int[n2];
        for(int i=0;i<n2;i++){
            a2[i]=sc.nextInt();
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int val:a1){
            if(hm.containsKey(val)){
                int of=hm.get(val);
                int nf=of+1;
                hm.put(val,nf);
            }
            else{
                hm.put(val,1);
            }
        }

        for(int val:a2){
            if(hm.containsKey(val)&&hm.get(val)>0){
                hm.put(val,hm.get(val)-1);
                arrayList.add(val);
            }
        }
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i));
        }
    }
}
