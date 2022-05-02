package Array_String;

public class remove {
    public static int findNumber(String s){
        try{
            return Integer.parseInt(s);
        }
        catch (Exception e){
            return 0;
        }
    }
    public static String removeDigit(String s, char d) {
        int maxi=Integer.MIN_VALUE;
        String ans="";
        String temp="";
        int val=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==d){
                temp=String.copyValueOf(s.toCharArray(),0,s.length());
                temp=temp.substring(0,i)+temp.substring(i+1);
                val=findNumber(temp);
                if(val>maxi){
                    ans=String.copyValueOf(temp.toCharArray(),0,temp.length());
                }
                maxi=Math.max(maxi,val);
            }
            else{
                continue;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="1231";
        char d='1';
        System.out.println(removeDigit(s,d));
        System.out.println(removeDigit("2998589353917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471",'3'));
        System.out.println(removeDigit("551",'5'));
    }
}
