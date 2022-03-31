package Array_String;

public class plusone {
    public static int [] plusone(int[] digits) {
        int n=digits.length-1;
        if(digits[n]<9){
            digits[n]+=1;
            return digits;
        }
        else{
            for(int i=n;i>=0;i--){
                if(digits[i]==9){
                    digits[i]=0;
                }
                else{
                    digits[i]+=1;
                    return digits;
                }
            }
            int ans[] =new int[n+2];
            ans[0]=1;
            for(int i=1;i<n+2;i++){
                ans[i]=0;
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        int [] arr={9,9};
        int [] ans=plusone(arr);
        for(int i=0;i< ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
