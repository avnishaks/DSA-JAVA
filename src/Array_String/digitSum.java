package Array_String;

public class digitSum {
    public static String find (String s,int k){
        String ans="";
        int val=0;
        int p=0;
        while(p<s.length())
        {
            val=0;
            for(int j=0;j<k&&p<s.length();j++){
                val+=Character.getNumericValue(s.charAt(p));
                p++;
            }
            ans+=String.valueOf(val);
        }
        return ans;
    }
    public static String DigitSum(String s, int k){
       String ans=s;
       while(ans.length()>k){
           ans=find(ans,k);
       }
       return ans;
    }
    public static void main(String[] args) {
        String s="00000000";
        int k=3;
        System.out.println(DigitSum(s,k));
    }
}
