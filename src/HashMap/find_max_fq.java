package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class find_max_fq {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(hm.containsKey(ch)){
                int old_frq=hm.get(ch);
                int new_frq=old_frq+1;
                hm.put(ch,new_frq);
            }
            else {
                hm.put(ch,1);
            }
        }
        char mfc=str.charAt(0);

        for(Character key:hm.keySet()){
            if(hm.get(key)>hm.get(mfc)){
                mfc=key;
            }
        }
        System.out.println(mfc);
    }
}
