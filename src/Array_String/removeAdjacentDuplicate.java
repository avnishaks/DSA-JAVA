package Array_String;

public class removeAdjacentDuplicate {
    public static String remove(String s) {
        // code here
        String res="";
        int i=0;
        while(i<s.length()){
            char ch=s.charAt(i);
            int f=0;
            while(i<s.length() && ch==s.charAt(i)){
                f++;
                i++;
            }
            if(f==1){
                res+=ch;
            }
        }
        if(res.equals(s)){
            return res;
        }
        return remove(res);
    }
    public static void main(String[] args) {
        String ans="geek";
        System.out.println(remove(ans));
    }
}
