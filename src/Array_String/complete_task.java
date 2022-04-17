package Array_String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class complete_task {
    public  static int  findTask(int [] task){
        Arrays.sort(task);
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<task.length;i++){
            mp.put(task[i],mp.get(task[i])==null?1:mp.get(task[i])+1);
        }
        int cnt=0;
        for(Map.Entry<Integer,Integer> freq: mp.entrySet()){
            int f=freq.getValue();
            if(f==1){
                return -1;
            }
            cnt=cnt+f/3;
            if(f%3!=0){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int task[]={2,2,3,3,2,4,4,4,4,4};
        System.out.println(findTask(task));
        int tasks[]={2,3,3};
        System.out.println(findTask(tasks));
    }
}
