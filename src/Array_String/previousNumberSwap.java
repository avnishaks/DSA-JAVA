package Array_String;

public class previousNumberSwap {
    public static String swap(String s,int i, int j){
        char ch[]=s.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }
    public static String previous(String s){
        int i=s.length()-2;
        while (i>=0&&s.charAt(i)<=s.charAt(i+1)){
            i--;
        }
        if(i==-1)
            return "-1";
        int min=Integer.MAX_VALUE;
        int idx=0;
        for(int j=i+1;j<s.length();j++)
        {
            int d=s.charAt(i)-s.charAt(j);
            if(d>0 && min>d)
            {
                min=d;
                idx=j;
            }
        }
        s=swap(s,i,idx);
        if(s.charAt(0)!='0'){
            return s;
        }
        return "-1";
    }
    public static void main(String[] args) {
        String s="99900000";
        System.out.println(previous(s));
    }
}
