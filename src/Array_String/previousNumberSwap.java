package Array_String;

public class previousNumberSwap {
    public static boolean flag=false;
    public static String swap(String s,int i, int j){
        char ch[]=s.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        flag=true;
        return String.valueOf(ch);
    }
    public static String previous(String s){
        char chArr[];
        String st="";
        char ch[]=s.toCharArray();
        int i=s.length()-2;
        while(i>=0&&ch[i]<=ch[i+1]){
            i--;
        }
        if(i>=0){
            int j=s.length()-1;
            while(ch[i]<=ch[j]){
                j--;
            }
            st=String.valueOf(ch);
            st=swap(st,i,j);
        }
        if(flag==true&&st.charAt(0)!='0'){
            return st;
        }
        return "-1";
    }
    public static void main(String[] args) {
        String s="77";
        System.out.println(previous(s));
    }
}
