package Stack_Queue_Programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DesignStack {
    public static class CustomStack {

        int value[];
        int increment[];
        int index;

        public CustomStack(int maxSize) {
            value = new int[maxSize];
            increment = new int[maxSize];
            index=-1;
        }
            /*
         1. If space is full index+1==value.length then return.
         2. index++
         3. value[index]=x and increment[index]=0
             */
        public void push(int x) {
            // complete this function
            if(index+1== value.length){
                return;
            }
            index++;
            value[index]=x;
            increment[index]=0;
        }
/*
        1. if we have no element then return -1;
        2. find the x and inc element.
        3. if we have more element then push the inc to next increment.
        4. Return the element

 */
        public int pop() {
            // complete this function
            if(index==-1){
                return -1;
            }
            int x=value[index];
            int inc=increment[index];
            index--;
            if(index>=0){
                increment[index]+=inc;
            }
            return x+inc;
        }

        public void increment(int k, int val) {
            // complete this function
            int ind=Math.min(k-1,index);
            if(index>=0){
                increment[ind]+=val;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int maxsize = Integer.parseInt(read.readLine());

        CustomStack cs = new CustomStack(maxsize);

        while(true){
            String task[] = read.readLine().split(" ");
            if(task[0].equals("push")){
                cs.push(Integer.parseInt(task[1]));
            }else if(task[0].equals("pop")){
                System.out.println(cs.pop());
            }else if(task[0].equals("increment")){
                cs.increment(Integer.parseInt(task[1]), Integer.parseInt(task[2]));
            }else{
                break;
            }
        }
        System.out.println("exit");
    }
}
