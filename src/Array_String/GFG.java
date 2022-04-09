package Array_String;

import java.io.*;
import java.util.*;
import java.math.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());

        while(t-- > 0)
        {
            int n = Integer.parseInt(sc.next());

            String s[] = new String[n];
            for(int i=0;i<n;i++)
            {
                s[i] = sc.next();
            }
            Solution T = new Solution();
            System.out.println(T.lcp(s,n));
        }

    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String lcp(String s[],int n)
    {
        // Write your code here
        if(n==0){
            return "";
        }
        String prefix=s[0];
        for(int i=1;i<n;i++){
            System.out.println("Value is    ----->>>   "+i+"   "+ s[i].indexOf(prefix));
            while(s[i].indexOf(prefix)!=0){
                System.out.println("Repeat Value is    ----->>>   "+ s[i].indexOf(prefix));
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "-1";
                }
            }
        }
        return prefix;

    }
}