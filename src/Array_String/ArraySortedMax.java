package Array_String;

public class ArraySortedMax {
    public  static  int helper(int[][]arr,int B){
        int mini=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==B){
                    ans=(i+1)*1009+(j+1);
                    mini=Math.min(mini,ans);
                }
            }
        }
        if(mini==Integer.MAX_VALUE){
            return -1;
        }
        else {
            return mini;
        }
    }
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int B=2;
        int val=helper(arr,B);
        System.out.println(val);
    }
}
