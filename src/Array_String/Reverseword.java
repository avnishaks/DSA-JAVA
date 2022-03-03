package Array_String;

public class Reverseword {
    public  static  String reverseword(String s){
        String [] st=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=st.length-1;i>=0;i--){
            sb.append(st[i]+" ");
        }
        for(int i=0;i< st.length;i++){
            System.out.print(st[i]+" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="The sky is blue";
        System.out.println(reverseword(s));
    }
}
